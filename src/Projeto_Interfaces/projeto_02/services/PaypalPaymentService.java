package Projeto_Interfaces.projeto_02.services;

public class PaypalPaymentService implements PaymentService {

    private static final double TAX_PAYMENT = 0.02;
    private static final double TAX_INSTALLMENT = 0.01;

    @Override
    public double calculatePaymentValue(double amount, int month) {
        return amount * (1 + TAX_INSTALLMENT * month);
    }

    @Override
    public double calculateInstallmentValue(double amount) {
        return (TAX_PAYMENT + 1) * amount;
    }
}
