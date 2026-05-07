package Projeto_Interfaces.projeto_02.services;

public class PaypalPaymentService implements PaymentService {

    private static final double TAX_PAYMENT = 0.02;
    private static final double TAX_INSTALLMENT = 0.01;

    @Override
    public double taxPayment(double amount) {
        return 0;
    }

    @Override
    public double taxInstallment(double amount) {
        return 0;
    }
}
