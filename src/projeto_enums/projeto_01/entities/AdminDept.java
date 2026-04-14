package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.services.CalculationSalary;
import projeto_enums.projeto_01.services.CalculationService;

public class AdminDept extends Department {

    public AdminDept() {
    }

    public AdminDept(Integer additional) {
        super(additional);
    }

    @Override
    public double getDayWorkSalary() {
        return 150.00;
    }

    @Override
    public double getOvertimeRate() {
        return 120;
    }

    @Override
    public double getTax() {
        return 500.00;
    }


}
