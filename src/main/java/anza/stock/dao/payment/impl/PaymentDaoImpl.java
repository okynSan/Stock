///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package anza.stock.dao.payment.impl;
//
//import anza.stock.dao.payment.IPaymentDao;
//import anza.stock.model.payment.Payment;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// *
// * @author andrey_zatvornitskiy
// */
//@Repository
//@PropertySource(value = {"classpath:/application.properties"})
//@EnableTransactionManagement
//public class PaymentDaoImpl implements IPaymentDao {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Payment> getAllPayments() {
//        String hql = "FROM Payment";
//        return (List<Payment>) entityManager.createQuery(hql).getResultList();
//    }
//
//    @Override
//    public void saveNewPayment(Payment p) {
//        entityManager.merge(p);
//    }
//
//}
