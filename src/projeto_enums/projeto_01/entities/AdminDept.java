package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;

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
    public double getOvertimeRate() {
        return 120;
    }

    @Override
    public double getTax() {
        return 500.00;
    }

}
