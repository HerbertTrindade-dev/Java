package projeto_enums.projeto_01.services;

import projeto_enums.projeto_01.entities.Department;
import projeto_enums.projeto_01.entities.Worker;
import projeto_enums.projeto_01.enums.WorkerLevel;

public interface CalculationSalary {
     default double salary(int daysWork,double dayValue,double bonusLevel){
         double base = daysWork * dayValue;
         return base *( 1 + bonusLevel);
    }
}
