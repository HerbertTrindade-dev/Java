package projeto_enums.projeto_01.services;


public interface CalculationBonusAmount {
     default double bonusAmount(int additinal,double extras){
        return additinal * extras;
    }
}
