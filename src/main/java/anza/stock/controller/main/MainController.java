/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class MainController {
    
    @RequestMapping(value="/")
    public String getHello(){
        System.out.println("Hello from Controller as");
        return "index";
    }
    
}
