package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.interfaces.CalculationBonusAmount;

import java.time.LocalDate;

public class Worker implements CalculationBonusAmount {

    private String name;
    private LocalDate birthday;
    private Integer daysWork;
    private Department department;


    public Worker() {
    }

    public Worker(String name, LocalDate birthday, Integer daysWork, Department department) {
        this.name = name;
        this.birthday = birthday;
        this.daysWork = daysWork;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getDaysWork() {
        return daysWork;
    }

    public void setDaysWork(Integer daysWork) {
        this.daysWork = daysWork;
    }

    public double salary() {
        double baseSalary = this.daysWork * department.getDayValue();
        return baseSalary * (1 + department.getLevel().getIncreaseSalary()) + bonusAmount();
    }

    @Override
    public double bonusAmount() {
        return 0;
    }
}
