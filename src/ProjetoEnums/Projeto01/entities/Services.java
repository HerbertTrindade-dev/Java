package ProjetoEnums.Projeto01.entities;

import java.time.LocalDate;

public class Services {

    private Double valuePerHour;
    private Integer qtdHour;
    private LocalDate date;

    public Services(){
    }

    public Services(Double valuePerHour, Integer qtdHour, LocalDate date){
        this.valuePerHour = valuePerHour;
        this.qtdHour = qtdHour;
        this.date = date;
    }

    public double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    public int getQtdHour(){
        return qtdHour;
    }

    public void setQtdHour(int qtdHour){
        this.qtdHour = qtdHour ;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public double totalValue(){
        return qtdHour * valuePerHour;
    }



}
