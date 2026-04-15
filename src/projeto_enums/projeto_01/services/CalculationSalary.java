package projeto_enums.projeto_01.services;

public interface CalculationSalary {
     default double salary(int daysWork,double dayValue,double bonusLevel){
         double base = daysWork * dayValue;
         return base *( 1 + bonusLevel);
    }
}
