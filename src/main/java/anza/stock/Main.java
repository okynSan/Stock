/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock;

import anza.stock.config.BeanConfig;
import anza.stock.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Configuration
@ComponentScan(basePackages = "anza.stock")
@Import({BeanConfig.class, WebConfig.class})
@EnableAutoConfiguration
@SpringBootApplication
public class Main extends SpringBootServletInitializer{
    
    private static Class applicationClass = Main.class;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        
        return application.sources(applicationClass);
    }
   
}
