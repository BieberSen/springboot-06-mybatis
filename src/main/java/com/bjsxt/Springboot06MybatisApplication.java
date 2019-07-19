package com.bjsxt;

import com.alibaba.druid.pool.DruidDataSource;
import com.bjsxt.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigurationProperties(DataSourceConfig.class)
@PropertySource("classpath:jdbc.properties")
public class Springboot06MybatisApplication {
	@Autowired
	private DataSourceConfig dataSourceConfig;
	public static void main(String[] args) {
		SpringApplication.run(Springboot06MybatisApplication.class, args);
	}

	@Bean
	public DruidDataSource getDruidDataSource(){
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(dataSourceConfig.getUrl());
		druidDataSource.setUsername(dataSourceConfig.getUsername());
		druidDataSource.setPassword(dataSourceConfig.getPassword());
		return druidDataSource;
	}
}
