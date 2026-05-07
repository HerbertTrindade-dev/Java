package Projeto_Interfaces.projeto_02.entities;

import Projeto_Interfaces.projeto_02.services.ContractService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();
    private ContractService contractService;

    public Contract(int number, LocalDate date, double totalValue, List<Installment> installments, ContractService contractService) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = installments;
        this.contractService = contractService;
    }

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    public void removeInstallment(Installment installment){
        installments.remove(installment);
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
