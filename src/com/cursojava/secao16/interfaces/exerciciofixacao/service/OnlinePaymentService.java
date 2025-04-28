package com.cursojava.secao16.interfaces.exerciciofixacao.service;

public interface OnlinePaymentService {

    double FEE_PERCENTAGE = 0.02;
    double MONTHLY_INTEREST = 0.01;

    double paymentFee(double amount);
    double interest(double amount, int months);
}
