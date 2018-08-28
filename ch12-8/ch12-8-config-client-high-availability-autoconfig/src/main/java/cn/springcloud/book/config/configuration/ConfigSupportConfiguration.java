package cn.springcloud.book.config.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.env.*;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @author: zunfa.zhong
 * @date: 2018/7/7
 * @time: 21:42
 * @description :
 */
@Configuration
@EnableConfigurationProperties(ConfigSupportProperties.class)
public class ConfigSupportConfiguration implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {

    private final Logger LOGGER = LoggerFactory.getLogger(ConfigSupportConfiguration.class);
    private final Integer orderNum = Ordered.HIGHEST_PRECEDENCE + 11;

    @Autowired(required = false)
    private List<PropertySourceLocator> propertySourceLocators = Collections.EMPTY_LIST;

    @Autowired
    private ConfigSupportProperties configSupportProperties;


    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        if (!isHasCloudConfigLocator(this.propertySourceLocators)) {
            LOGGER.info("未启用Config Server管理配置");
            return;
        }


        LOGGER.info("检查Config Service配置资源");
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        LOGGER.info("加载PropertySources源：" + propertySources.size() + "个");

        if (!configSupportProperties.isEnable()) {
            LOGGER.warn("未启用配置备份功能，可使用{}.enable打开", ConfigSupportProperties.CONFIG_PREFIX);
            return;
        }


        if (isCloudConfigLoaded(propertySources)) {
            PropertySource cloudConfigSource = getLoadedCloudPropertySource(propertySources);
            LOGGER.info("成功获取ConfigService配置资源");
            //备份
            Map<String, Object> backupPropertyMap = makeBackupPropertyMap(cloudConfigSource);
            doBackup(backupPropertyMap, configSupportProperties.getFallbackLocation());

        } else {

            LOGGER.error("获取ConfigService配置资源失败");
            Properties backupProperty = loadBackupProperty(configSupportProperties.getFallbackLocation());
            if (backupProperty != null) {
                HashMap backupSourceMap = new HashMap<>(backupProperty);

                PropertySource backupSource = new MapPropertySource("backupSource", backupSourceMap);
                propertySources.addFirst(backupSource);
                LOGGER.warn("使用备份的配置启动：{}", configSupportProperties.getFallbackLocation());
            }
        }

    }

    @Override
    public int getOrder() {
        return orderNum;
    }

    /**
     * 是否启用了Spring Cloud Config获取配置资源
     *
     * @param propertySourceLocators
     * @return
     */
    private boolean isHasCloudConfigLocator(List<PropertySourceLocator> propertySourceLocators) {
        for (PropertySourceLocator sourceLocator : propertySourceLocators) {
            if (sourceLocator instanceof ConfigServicePropertySourceLocator) {
                return true;
            }
        }
        return false;
    }

    /**
     * 是否启用Cloud Config
     *
     * @param propertySources
     * @return
     */
    private boolean isCloudConfigLoaded(MutablePropertySources propertySources) {
        if (getLoadedCloudPropertySource(propertySources) == null) {
            return false;
        }
        return true;
    }

    /**
     * 获取加载的Cloud Config 配置项
     *
     * @param propertySources
     * @return
     */
    private PropertySource getLoadedCloudPropertySource(MutablePropertySources propertySources) {
        if (!propertySources.contains(PropertySourceBootstrapConfiguration.BOOTSTRAP_PROPERTY_SOURCE_NAME)) {
            return null;
        }

        PropertySource propertySource = propertySources.get(PropertySourceBootstrapConfiguration.BOOTSTRAP_PROPERTY_SOURCE_NAME);
        if (propertySource instanceof CompositePropertySource) {
            for (PropertySource<?> source : ((CompositePropertySource) propertySource).getPropertySources()) {
                if (source.getName().equals("configService")) {
                    return source;
                }
            }
        }
        
        return null;
    }


    /**
     * 生成备份的配置数据
     *
     * @param propertySource
     * @return
     */
    private Map<String, Object> makeBackupPropertyMap(PropertySource propertySource) {

        Map<String, Object> backupSourceMap = new HashMap<>();
        if (propertySource instanceof CompositePropertySource) {
            CompositePropertySource composite = (CompositePropertySource) propertySource;
            for (PropertySource<?> source : composite.getPropertySources()) {
                if (source instanceof MapPropertySource) {
                    MapPropertySource mapSource = (MapPropertySource) source;
                    for (String propertyName : mapSource.getPropertyNames()) {
                        // 前面的配置覆盖后面的配置
                        if (!backupSourceMap.containsKey(propertyName)) {
                            backupSourceMap.put(propertyName, mapSource.getProperty(propertyName));
                        }
                    }
                }
            }
        }
        return backupSourceMap;
    }

    /**
     * 生成备份文件
     * @param backupPropertyMap
     * @param filePath
     */
    private void doBackup(Map<String, Object> backupPropertyMap, String filePath) {
        FileSystemResource fileSystemResource = new FileSystemResource(filePath);
        File backupFile = fileSystemResource.getFile();
        try {
            if (!backupFile.exists()) {
                backupFile.createNewFile();
            }
            if (!backupFile.canWrite()) {
                LOGGER.error("无法读写文件：{}", fileSystemResource.getPath());
            }

            Properties properties = new Properties();
            Iterator<String> keyIterator = backupPropertyMap.keySet().iterator();
            while (keyIterator.hasNext()) {
                String key = keyIterator.next();
                properties.setProperty(key, String.valueOf(backupPropertyMap.get(key)));
            }

            FileOutputStream fos = new FileOutputStream(fileSystemResource.getFile());
            properties.store(fos, "Backup Cloud Config");
        } catch (IOException e) {
            LOGGER.error("文件操作失败：{}", fileSystemResource.getPath());
            e.printStackTrace();
        }
    }

    /**
     * 加载本地文件
     * @param filePath
     * @return
     */
    private Properties loadBackupProperty(String filePath) {
        PropertiesFactoryBean propertiesFactory = new PropertiesFactoryBean();
        Properties props = new Properties();
        try {
            FileSystemResource fileSystemResource = new FileSystemResource(filePath);
            propertiesFactory.setLocation(fileSystemResource);

            propertiesFactory.afterPropertiesSet();
            props = propertiesFactory.getObject();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return props;
    }
}
