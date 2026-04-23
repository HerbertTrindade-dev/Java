package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class AdminDept extends Department {

    private Integer qtdProjects;
    public AdminDept() {
    }

    public AdminDept( WorkerLevel level,Integer qtdProjects) {
        super(level);
        this.qtdProjects = qtdProjects;
    }

    public Integer getQtdProjects() {
        return qtdProjects;
    }

    public void setQtdProjects(Integer qtdProjects) {
        this.qtdProjects = qtdProjects;
    }

    @Override
    public double getDayValue() {
        return 150.00;
    }

    @Override
    public double getBonus() {
        return 500.00;
    }

}
