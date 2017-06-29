/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.dao.payment;

import anza.stock.model.payment.Payment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Transactional
public interface IPaymentDao extends JpaRepository<Payment, Long> {

}
