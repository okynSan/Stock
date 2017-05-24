/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.controller.main;

import anza.stock.controller.model.payment.Payment;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public ModelAndView getHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("paymentList", getPayments());
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    public ModelAndView savePayment(){
        
    }
    

    private List getPayments() {
        Payment p = new Payment(1, new Date(), "Аванс", 50.5f, "andrey_zatvornickiy");
        return Arrays.asList(p);        
    }

}
