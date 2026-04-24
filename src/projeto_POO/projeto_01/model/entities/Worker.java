package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.services.Taxable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {

    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
        double baseSalary = this.daysWork * department.getValueWork();
        return baseSalary * (1 + department.getLevel().getIncreaseSalary()) + department.bonusAmount();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ").append(getName()).append("| Data de nascimento: ").append(getBirthday().format(fmt));
        sb.append("\nDias trabalhados: ").append(getDaysWork()).append(" | Salario bruto:R$").append(salary());
        return sb.toString();
    }
}
