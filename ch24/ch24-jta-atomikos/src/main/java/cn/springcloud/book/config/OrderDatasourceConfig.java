package cn.springcloud.book.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
@EnableJpaRepositories(basePackages = "cn.springcloud.book.dao.order", entityManagerFactoryRef = "orderEntityManager",
        transactionManagerRef = "transactionManager")
public class OrderDatasourceConfig {

    @Bean(name = "orderDatasource")
    @Qualifier("orderDatasource")
    @ConfigurationProperties(prefix="spring.jta.atomikos.datasource.order")
    @Primary
    public DataSource orderDatasource() {
        return new AtomikosDataSourceBean();
    }

    @Bean(name = "orderEntityManager")
    @Primary
    public LocalContainerEntityManagerFactoryBean orderEntityManager(TransactionManager transactionManager,UserTransaction userTransaction) throws Throwable {
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
        entityManager.setJtaDataSource(orderDatasource());
        entityManager.setJpaVendorAdapter(jpaVendorAdapter);
        entityManager.setPackagesToScan("cn.springcloud.book.domain.order");
        entityManager.setPersistenceUnitName("orderPersistenceUnit");
        entityManager.setJpaPropertyMap(properties);
        return entityManager;
    }
}
