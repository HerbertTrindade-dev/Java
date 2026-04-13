package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double salary;

    private Department department;
    private List<HourContract> hourContract = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name,WorkerLevel level,Double salary,Department department){
         this.name = name;
         this.level = level;
         this.salary = salary;
         this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public List<HourContract> getHourContract(){
        return hourContract;
    }

    public void addServices(HourContract hourContract){
        this.hourContract.add(hourContract);
    }

    public void removeServices(HourContract hourContract){
        this.hourContract.remove(hourContract);
    }

    public double income(int month, int year){
        double totalSalary = salary;
        for (HourContract s : hourContract ){
            if (month == s.getDate().getMonthValue() && year == s.getDate().getYear()){
                totalSalary += s.totalValue();
            }
        }
        return totalSalary;
    }

    @Override
    public String toString(){
        return "Name:"+ name
                + "\nDepartamento:"+department.getName();

    }



}
