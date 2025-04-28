package com.cursojava.secao16.interfaces.exerciciofixacao.service;

public class PaypalService implements OnlinePaymentService {


    public double paymentFee(double amount){
        return amount * FEE_PERCENTAGE;
    }

    public  double interest(double amount, int months){
        return amount * MONTHLY_INTEREST * months;
    }
}
