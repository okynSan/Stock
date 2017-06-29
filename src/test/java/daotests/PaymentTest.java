/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daotests;

import anza.stock.Main;
import anza.stock.dao.payment.IPaymentDao;
import anza.stock.model.payment.Payment;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author andrey_zatvornitskiy
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@WebAppConfiguration
public class PaymentTest {

    @Autowired
    IPaymentDao paymentDao;

    public PaymentTest() {
    }

    @Test
    public void test() {
        paymentDao.save(new Payment(1,new Date(), "asd", 2.4f, "asd"));
    }

}
