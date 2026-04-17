package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.services.CalculationBonusAmount;
import projeto_POO.projeto_01.model.services.CalculationSalary;
import java.time.LocalDate;

public class Worker implements CalculationSalary, CalculationBonusAmount {

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

    public void setBirthday(LocalDate birthday){
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

    @Override
    public double bonusAmount() {
        return department.getAdditional() * department.getBonus();
    }

    @Override
    public double salary() {
        double baseSalary = this.daysWork * department.getDayValue();
        return  baseSalary *(1+ department.getLevel().getIncreaseSalary()) + bonusAmount();
    }

}
