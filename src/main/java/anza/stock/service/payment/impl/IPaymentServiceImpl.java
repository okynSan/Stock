/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.service.payment.impl;

import anza.stock.dao.payment.IPaymentDao;
import anza.stock.model.payment.Payment;
import anza.stock.service.payment.IPaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component("iPaymentService")
public class IPaymentServiceImpl implements IPaymentService {

    @Autowired
    IPaymentDao paymentDao;

    @Override
    public List<Payment> getAllPaymentsList() {
        return paymentDao.findAll();
    }

}
