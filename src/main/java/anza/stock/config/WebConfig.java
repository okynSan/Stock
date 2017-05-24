/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    
    public void addResourceHandlers(final ResourceHandlerRegistry registry){
        registry.addResourceHandler("/*.jsp").addResourceLocations("/WEB-INF/jsp/");
    }
    
}
