package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.TypeDepartment;
import projeto_POO.projeto_01.model.enums.WorkerLevel;



public abstract class Department{

    private WorkerLevel level;
    private TypeDepartment tp;

    public Department(WorkerLevel level,TypeDepartment tp) {
        this.level = level;
        this.tp = tp;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public abstract double getBonusRate();

    public abstract int getProductionCount();

    public abstract double getValueWork();

    public double bonusAmount(){
        return getBonusRate() * getProductionCount();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("DEPARTAMENTO:").append(tp.name()).append(" | Nivel:").append(getLevel());
        sb.append("\nDiaria:R$").append(getValueWork()).append(" | Bonus:R$").append(bonusAmount());
        sb.append("\n-------------------------------");
        return sb.toString();
    }
}



