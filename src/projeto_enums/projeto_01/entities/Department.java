package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.services.CalculationSalary;
import projeto_enums.projeto_01.services.CalculationSalaryAdditional;

import java.util.ArrayList;
import java.util.List;

public abstract class Department implements CalculationSalary, CalculationSalaryAdditional {

    private Integer additional;
    private List<Worker> workerList = new ArrayList<>();



    public Department() {
    }

    public Department(Integer additional) {
        this.additional = additional;
    }

    public Integer getAdditional() {
        return additional;
    }

    public void setAdditional(Integer additional) {
        this.additional = additional;
    }

    public double getOvertimeRate() {
        return 0;
    }

    public double getDayWorkSalary() {
        return 0;
    }

    public double getTax() {
        return 0;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void addWorker(Worker worker){
        workerList.add(worker);
   }

    public void removeWorker(Worker worker){
        workerList.remove(worker);
    }



}



