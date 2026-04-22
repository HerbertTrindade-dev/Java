package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.interfaces.CalculationBonusAmount;
import projeto_POO.projeto_01.model.interfaces.CalculationSalary;
import java.time.LocalDate;

public class Worker implements CalculationSalary, CalculationBonusAmount {

    private String name;
    private LocalDate birthday;
    private Integer daysWork;


    public Worker(){
    }

    public Worker(String name, LocalDate birthday,Integer daysWork) {
        this.name = name;
        this.birthday = birthday;
        this.daysWork = daysWork;
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
