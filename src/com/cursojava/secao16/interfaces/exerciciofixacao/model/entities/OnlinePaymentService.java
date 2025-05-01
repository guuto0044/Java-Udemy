package com.cursojava.secao16.interfaces.exerciciofixacao.model.entities;

public interface OnlinePaymentService {

    double PAYMENT_FEE = 0.02;
    double SIMPLE_INTEREST = 0.01;

    double paymentFee(double amount);
    double interest(double amount, int months);
}
