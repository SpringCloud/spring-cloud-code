package cn.springcloud.book.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caibosi on 2018-07-25.
 */
@Configuration
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages = "cn.springcloud.book.dao.log", entityManagerFactoryRef = "logEntityManager",
        transactionManagerRef = "transactionManager")
public class LogDatasourceConfig {

    @Bean(name = "logDatasource")
    @Qualifier("logDatasource")
    @ConfigurationProperties(prefix="spring.jta.atomikos.datasource.log")
    public DataSource logDatasource() {
        return new AtomikosDataSourceBean();
    }

    @Bean(name = "logEntityManager")
    public LocalContainerEntityManagerFactoryBean logEntityManager(TransactionManager transactionManager, UserTransaction userTransaction) throws Throwable {
        AtomikosJtaPlatform.setTransactionManager(transactionManager);
        AtomikosJtaPlatform.setUserTransaction(userTransaction);

        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setDatabase(Database.H2);
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");

        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.transaction.jta.platform", AtomikosJtaPlatform.class.getName());
        properties.put("javax.persistence.transactionType", "JTA");
        properties.put("hibernate.hbm2ddl.auto","update");

        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setJtaDataSource(logDatasource());
        entityManager.setJpaVendorAdapter(jpaVendorAdapter);
        entityManager.setPackagesToScan("cn.springcloud.book.domain.log");
        entityManager.setPersistenceUnitName("logPersistenceUnit");
        entityManager.setJpaPropertyMap(properties);
        return entityManager;
    }
}
