package projeto_enums.projeto_01.entities;

public class SalesDept extends Department{

    public SalesDept() {
    }

    public SalesDept(Integer additional) {
        super(additional);
    }

    @Override
    public double getOvertimeRate() {
        return 1;
    }

    @Override
    public double getSalary() {
        return 2000.00;
    }
}

