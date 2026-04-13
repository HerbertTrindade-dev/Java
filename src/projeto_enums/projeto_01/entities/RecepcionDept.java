package projeto_enums.projeto_01.entities;

public class RecepcionDept extends Department{

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
    public double getSalary() {
        return 1500.00;
    }
}
