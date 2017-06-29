/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.model.payment;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "month")
    private Date month;
    @Column(name = "name_od_payment")
    private String nameOfPayment;
    @Column(name = "sum")
    private float sum;
    @Column(name = "payer")
    private String payer;

    public Payment() {
    }

    public Payment(int id, Date month, String nameOfPayment, float sum, String payer) {
        this.id = id;
        this.month = month;
        this.nameOfPayment = nameOfPayment;
        this.sum = sum;
        this.payer = payer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public String getNameOfPayment() {
        return nameOfPayment;
    }

    public void setNameOfPayment(String nameOfPayment) {
        this.nameOfPayment = nameOfPayment;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

}
