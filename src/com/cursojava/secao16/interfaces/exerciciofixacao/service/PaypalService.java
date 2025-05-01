package com.cursojava.secao16.interfaces.exerciciofixacao.service;

import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    public double paymentFee(double amount){
        return amount * PAYMENT_FEE;
    }

    public double interest(double amount, int months){
        return amount * SIMPLE_INTEREST * months;
    }
}
