package com.ssi;

import java.util.Properties;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ssi")
public class ProjectConf {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		vr.setPrefix("/WEB-INF/views/");
		return vr;
	}

	@Bean
	public ComboPooledDataSource myDataSource() {
		ComboPooledDataSource cr = new ComboPooledDataSource();
		try {
			cr.setDriverClass("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		cr.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		cr.setUser("root");
		cr.setPassword("root");
		return cr;

	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan("com.ssi");
		Properties prop= new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.hbm2ddl.auto", "update");
		return sessionFactory;
		
		

	}
	

}
