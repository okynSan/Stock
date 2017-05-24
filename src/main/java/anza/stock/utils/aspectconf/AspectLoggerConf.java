/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.utils.aspectconf;

import anza.stock.utils.AspectLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author andrey_zatvornitskiy
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"anza.stock.utils"})
public class AspectLoggerConf {
    
    @Bean   
    public AspectLogger myLogger(){
       return new AspectLogger();
    }
    
}
