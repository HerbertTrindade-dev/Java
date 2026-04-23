package projeto_POO.projeto_01.model.entities;

import projeto_POO.projeto_01.model.enums.WorkerLevel;

public class RecepcionDept extends Department {

    private Integer qtdPeoplesAtt;


    public RecepcionDept(WorkerLevel level, int qtdPeoplesAtt) {
        super( level);
        this.qtdPeoplesAtt = qtdPeoplesAtt;
    }

    @Override
    public double getDayValue() {
        return 80.00;
    }

    @Override
    public double getBonus() {
        return 2.5;
    }


}
