/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.controller.main;

import anza.stock.model.payment.Payment;
import anza.stock.service.payment.IPaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class MainController {

    @Autowired
    IPaymentService iPaymentService;

    @RequestMapping(value = "/")
    public ModelAndView getHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("paymentList", getPayments());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    private List<Payment> getPayments() {

        return iPaymentService.getAllPaymentsList();
    }

}
