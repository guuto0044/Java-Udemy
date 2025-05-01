package com.cursojava.secao16.interfaces.exerciciofixacao.service;

import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Contract;
import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Installment;
import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

//    private PaypalService paypalService;
//
//    public ContractService(PaypalService paypalService) {
//        this.paypalService = paypalService;
//    }

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double valueParcel = contract.getTotalValue()/months;
        for (int i = 1; i <= months; i++){

            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(valueParcel,i);
            double paymentFee = onlinePaymentService.paymentFee(valueParcel + interest);

            double quota = valueParcel + interest + paymentFee;

            contract.getInstallments().add(new Installment(dueDate,quota));

        }
    }
}
