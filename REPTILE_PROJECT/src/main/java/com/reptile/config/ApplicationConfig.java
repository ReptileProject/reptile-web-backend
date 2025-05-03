package com.reptile.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.reptile.model.dao")
public class ApplicationConfig {

}