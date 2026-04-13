package projeto_enums.projeto_01.entities;

public class AdminDept extends Department {

    public AdminDept() {
    }

    public AdminDept(Integer additional) {
        super(additional);
    }

    @Override
    public double getSalary() {
        return 3000.00;
    }

    @Override
    public double getOvertimeRate() {
        return 120;
    }
}
