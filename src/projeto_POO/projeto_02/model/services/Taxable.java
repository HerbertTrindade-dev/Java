package projeto_POO.projeto_02.model.services;

public interface Taxable {
    double calculationTax();
    default String taxInfo(){
        return "Taxa: R$"+ String.format("%.2f",calculationTax());
    }
}
