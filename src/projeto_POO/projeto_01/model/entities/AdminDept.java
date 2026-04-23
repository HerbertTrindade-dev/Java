package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class AdminDept extends Department {

    private Integer qtdProjects;

    public AdminDept(WorkerLevel level, Integer qtdProjects) {
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
    public double getProductionCount() {
        return 500.00;
    }

    @Override
    public double getBonusRate() {
        return 0;
    }

    @Override
    public double bonusAmount() {
        return 0;
    }


}

