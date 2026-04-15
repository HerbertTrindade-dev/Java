package projeto_enums.projeto_01.services;

import projeto_enums.projeto_01.entities.Department;

public interface CalculationBonus {
     default double bonus(int additinal,double extras){
        return additinal * extras;
    }
}
