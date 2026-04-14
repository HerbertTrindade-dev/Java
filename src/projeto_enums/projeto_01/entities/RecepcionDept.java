package projeto_enums.projeto_01.entities;

public class RecepcionDept extends Department {

    public RecepcionDept(Integer additional) {
        super(additional);
    }

    public RecepcionDept() {
    }

    @Override
    public double getOvertimeRate() {
        return 180;
    }

    @Override
    public double getDayWorkSalary() {
        return 80.00;
    }

    @Override
    public double getTax() {
        return 2.5;
    }

    @Override
    public void addWorker(Worker worker) {
        super.addWorker(worker);
    }

    @Override
    public void removeWorker(Worker worker) {
        super.removeWorker(worker);
    }

}
