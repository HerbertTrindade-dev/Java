package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class SalesDept extends Department {

    public SalesDept() {
    }

    public SalesDept(Integer additional) {
        super(additional);
    }

    public SalesDept(Integer additional ,WorkerLevel level, String name) {
        super(additional, level, name);
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

