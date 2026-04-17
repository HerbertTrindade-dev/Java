package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class AdminDept extends Department {

    public AdminDept() {
    }

    public AdminDept(Integer additional) {
        super(additional);
    }

    public AdminDept(Integer additional, WorkerLevel level, String name) {
        super(additional,level, name);
    }

    @Override
    public double getDayValue() {
        return 150.00;
    }

    @Override
    public double getBonus() {
        return 500.00;
    }

}
