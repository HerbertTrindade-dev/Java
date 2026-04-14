package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.services.CalculationSalary;
import projeto_enums.projeto_01.services.CalculationService;

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
    public double getDayWorkSalary() {
        return 80.00;
    }

    @Override
    public double getTax() {
        return 2.5;
    }
}
