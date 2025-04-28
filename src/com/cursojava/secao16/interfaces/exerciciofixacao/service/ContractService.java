package com.cursojava.secao16.interfaces.exerciciofixacao.service;

import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Contract;
import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getValueTotal() / months;

        for (int i = 1; i <= months; i++){

            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota,i);
            double paymentfee = onlinePaymentService.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + paymentfee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
