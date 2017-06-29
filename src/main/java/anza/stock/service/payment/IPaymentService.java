/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.service.payment;

import anza.stock.model.payment.Payment;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface IPaymentService {

    List<Payment> getAllPaymentsList();

}
