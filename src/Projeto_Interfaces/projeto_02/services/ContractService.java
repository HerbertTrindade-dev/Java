package Projeto_Interfaces.projeto_02.services;

import Projeto_Interfaces.projeto_02.entities.Contract;
import Projeto_Interfaces.projeto_02.entities.Installment;

public class ContractService {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void processContract(Contract contract, int month) {
        double valueTotalInstallment = 0.0;
        for (int i = 1; i <= month; i++) {
            valueTotalInstallment = paymentService.calculatePaymentValue(contract.getTotalValue() / month, i);
            Installment installment = new Installment(contract.getDate().plusMonths(i),paymentService.calculateInstallmentValue(valueTotalInstallment));
            contract.addInstallment(installment);
        }

    }
}
