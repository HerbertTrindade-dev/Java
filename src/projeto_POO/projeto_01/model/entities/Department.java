package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;


public abstract class Department {

    private Integer additional;
    private WorkerLevel level;
    private String name;
    private List<Worker> workers = new ArrayList<>();


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

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public void removeWorker(Worker worker){
        workers.remove(worker);
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



