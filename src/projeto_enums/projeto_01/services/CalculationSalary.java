package projeto_enums.projeto_01.services;

import projeto_enums.projeto_01.entities.Department;
import projeto_enums.projeto_01.entities.Worker;
import projeto_enums.projeto_01.enums.WorkerLevel;

public interface CalculationSalary {
     default double salary(WorkerLevel level, Worker work, Department dpt){
         return level.getIncreaseSalary() * work.getDaysWork() * dpt.getDayWorkSalary();

    }
}
