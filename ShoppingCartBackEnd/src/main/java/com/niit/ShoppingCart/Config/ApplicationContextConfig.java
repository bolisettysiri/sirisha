package com.niit.ShoppingCart.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ShoppingCart.Model.Category;
import com.niit.ShoppingCart.Model.Product;
import com.niit.ShoppingCart.Model.Supplier;
import com.niit.ShoppingCart.Model.User;
import com.niit.ShoppingCart.dao.CategoryDAO;
import com.niit.ShoppingCart.dao.CategoryDAOImpl;

@Configuration
@ComponentScan("com.niit.ShoppingCart.Config")
@EnableTransactionManagement

public class ApplicationContextConfig {
	@Bean(name="dataSource")
	public DataSource getdataSource(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	private Properties getHibernateProperties(){
		Properties properties=new Properties();
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		return properties;
	}
		
		@Autowired
		@Bean(name="sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource){
			LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
			sessionBuilder.addProperties(getHibernateProperties());
			sessionBuilder.addAnnotatedClass(Category.class);
			sessionBuilder.addAnnotatedClass(Supplier.class);
			sessionBuilder.addAnnotatedClass(Product.class);
			sessionBuilder.addAnnotatedClass(User.class);
			return sessionBuilder.buildSessionFactory();
		}
		

			@Autowired
			@Bean(name= "transactionManager")
			public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
				HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
				return transactionManager;
			}
				
			@Autowired
			@Bean(name="categoryDAO")
			public CategoryDAO getCategoryDAo(SessionFactory sessionFactory){
			return new CategoryDAOImpl(sessionFactory);
			
				
			}
			
		}
		
		
		
		
	


