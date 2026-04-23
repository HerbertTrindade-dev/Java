package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;
import projeto_POO.projeto_01.model.interfaces.CalculationBonusAmount;

public class SalesDept extends Department {

    private Integer qtdSales;

    public SalesDept() {
    }

    public SalesDept(WorkerLevel level, int qtdSales) {
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
    public double getProductionCount() {
        return 80;
    }

    @Override
    public double getBonusRate() {
        return 0.80;
    }


    @Override
    public double bonusAmount() {
        return getBonusRate() * getQtdSales();
    }

}

