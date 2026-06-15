package com.sb.SpringBootJune2026;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//        (exclude = {
//                org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
//                org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
//
//        })
public class SpringBootJune2026Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJune2026Application.class, args);

    }

}
