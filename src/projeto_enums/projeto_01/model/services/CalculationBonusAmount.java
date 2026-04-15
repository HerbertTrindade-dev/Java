package projeto_enums.projeto_01.model.services;


public interface CalculationBonusAmount {
     default double bonusAmount(int additinal,double extras){
        return additinal * extras;
    }
}
