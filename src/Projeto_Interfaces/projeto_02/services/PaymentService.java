package Projeto_Interfaces.projeto_02.services;

public interface PaymentService {
    double calculateInstallmentValue(double amount);
    double calculatePaymentValue(double amount, int month);
}
