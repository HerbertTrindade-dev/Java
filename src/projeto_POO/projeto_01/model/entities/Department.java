package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;


public abstract class Department {

    private WorkerLevel level;
    private List<Worker> workers = new ArrayList<>();


    public Department() {
    }


    public Department( WorkerLevel level) {
        this.level = level;
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

    public abstract double getDayValue();

    public abstract double getBonus();
}



