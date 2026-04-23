package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class SalesDept extends Department {
    private Integer qtdSales;
    public SalesDept() {
    }

    public SalesDept(WorkerLevel level,int qtdSales) {
        super(level);
        this.qtdSales = qtdSales;
    }

    public Integer getQtdSales() {
        return qtdSales;
    }

    public void setQtdSales(Integer qtdSales) {
        this.qtdSales = qtdSales;
    }

    @Override
    public double getDayValue() {
        return 100.00;
    }

    @Override
    public double getBonus() {
        return 25.00;
    }


}

