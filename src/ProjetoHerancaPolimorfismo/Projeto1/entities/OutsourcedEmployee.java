package ProjetoHerancaPolimorfismo.Projeto1.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(){
    }

    public OutsourcedEmployee(String name,Integer hours,Double valuePerHour,Double additionalCharge){
        super(name,hours,valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return  super.payment() + additionalCharge * 1.1;

    }
}
