package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;
import projeto_POO.projeto_01.model.interfaces.CalculationBonusAmount;

import java.util.ArrayList;
import java.util.List;


public abstract class Department {

    private WorkerLevel level;

    public Department() {
    }

    public Department(WorkerLevel level) {
        this.level = level;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public abstract double getProductionCount();

    public abstract double getBonusRate();

    public double bonusAmount(){
        return getBonusRate() * getProductionCount();
    };
}



