package com.split.configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.split.repositories", entityManagerFactoryRef = "entityManager", transactionManagerRef = "transactionManager")
@PropertySource("classpath:application.properties")
public class DataSourceConfig {

	/*@Autowired
	private Environment env;*/

	@Bean
	public DataSource dataSource() {
		System.out.println("Inside datasource -----> ");
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = dsLookup.getDataSource("jdbc/DefaultDB");
		return dataSource;
	}
	
	@Bean(name = "entityManager")
    public EntityManagerFactory  entityManagerFactory() {
		System.out.println("Inside userEntityManager -----> ");
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setJpaVendorAdapter(jpaVendorAdapter());
		em.setPackagesToScan("com.split.entity");
		em.afterPropertiesSet();
		return em.getObject();
	}
	
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        EclipseLinkJpaVendorAdapter ecliseLinkJpaVendorAdapter = new EclipseLinkJpaVendorAdapter();
        ecliseLinkJpaVendorAdapter.setShowSql(false);
        ecliseLinkJpaVendorAdapter.setGenerateDdl(false);
        return ecliseLinkJpaVendorAdapter;
    }
    
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(){
    	System.out.println("transactionManager -----> ");
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setDataSource(dataSource());
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory());
        
        System.out.println("transactionManager will COMMIT NOW ");
        TransactionStatus transactionStatus=jpaTransactionManager.getTransaction(new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED));
        jpaTransactionManager.commit(transactionStatus);
        System.out.println("DatasourceConfig transactionStatus is  " +transactionStatus);
        
        return jpaTransactionManager;
    }
	
}
