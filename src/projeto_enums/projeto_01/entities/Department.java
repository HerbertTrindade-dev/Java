package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;


public abstract class Department {

    private Integer additional;
    private WorkerLevel level;
    private String name;


    public Department() {
    }

    public Department(Integer additional) {
        this.additional = additional;
    }

    public Department(Integer additional, WorkerLevel level, String name) {
        this.additional = additional;
        this.level = level;
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Integer getAdditional() {
        return additional;
    }

    public void setAdditional(Integer additional) {
        this.additional = additional;
    }

    public String getName() {
        return name;
    }

    public abstract double getDayValue();

    public abstract double getBonus();
}



