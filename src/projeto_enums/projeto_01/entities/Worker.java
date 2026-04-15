package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;
import projeto_enums.projeto_01.services.CalculationSalary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private LocalDate birthday;
    private Integer daysWork;
    private Department department;


    public Worker(){
    }

    public Worker(String name, LocalDate birthday,Integer daysWork,Department department) {
        this.name = name;
        this.birthday = birthday;
        this.daysWork = daysWork;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(int birthday){
        this.birthday = this.birthday;
    }

    public Integer getDaysWork() {
        return daysWork;
    }

    public void setDaysWork(Integer daysWork) {
        this.daysWork = daysWork;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //public double bonus(){
      //  double bonus = department.bonus(department.getAdditional())
    //}

    public double TotalIncome(){
        double salary = department.salary(this.daysWork,department.getDayValue(),department.getLevel());
    }
}
