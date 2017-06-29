/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"anza.stock.model"})
@EnableJpaRepositories(basePackages = {"anza.stock.dao"})
@EnableTransactionManagement
public class RepositoryConfiguration {
    
}
