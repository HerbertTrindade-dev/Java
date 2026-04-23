package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class RecepcionDept extends Department {

    private Integer qtdProjects;


    public RecepcionDept(WorkerLevel level, int qtdProjects) {
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
        return 80.00;
    }

    @Override
    public double getBonusRate() {
        return 0.80;
    }

    @Override
    public double bonusAmount() {
        return getBonusRate() * qtdProjects;
    }
}
