/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.stock.controller.model.payment;

import java.util.Date;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Payment {
    
    private int id;
    private Date month;
    private String nameOfPayment;
    private float sum;
    private String payer;

    public Payment(int id, Date month, String nameOfPayment, float sum, String payer) {
        this.id = id;
        this.month = month;
        this.nameOfPayment = nameOfPayment;
        this.sum = sum;
        this.payer = payer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
