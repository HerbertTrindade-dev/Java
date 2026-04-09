package ProjetoEnums.Projeto01.entities;

import ProjetoEnums.Projeto01.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double salary;

    private Department department;
    private List<Services> services = new ArrayList<>();

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

    public List<Services> getServices(){
        return services;
    }

    public void addServices(Services services){
        this.services.add(services);
    }

    public void removeServices(Services services){
        this.services.remove(services);
    }

    public double income(int month, int year){
        double totalSalary = salary;
        for (Services s : services ){
            if (month == s.getDate().getMonthValue() && year == s.getDate().getYear()){
                totalSalary += s.totalValue();
            }
        }
        return totalSalary;
    }

    @Override
    public String toString(){
        return "Name:"+ name
                + "\nDepartamento:"+department.getNameDepartment();

    }



}
