package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.services.CalculationSalary;
import projeto_enums.projeto_01.services.CalculationService;

public class SalesDept extends Department {

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
    public double getDayWorkSalary() {
        return 100.00;
    }

    @Override
    public double getTax() {
        return 25.00;
    }
}

