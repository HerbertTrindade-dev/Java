package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;

public class RecepcionDept extends Department {

    public RecepcionDept() {
    }

    public RecepcionDept(Integer additional) {
        super(additional);
    }

    public RecepcionDept(Integer additional,  WorkerLevel level, String name) {
        super(additional, level, name);
    }

    @Override
    public double getDayValue() {
        return 80.00;
    }

    @Override
    public double getBonus() {
        return 2.5;
    }


}
