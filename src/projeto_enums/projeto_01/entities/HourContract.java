package projeto_enums.projeto_01.entities;

import java.time.LocalDate;

public class HourContract {

    private Double valuePerHour;
    private Integer qtdHour;
    private LocalDate date;

    public HourContract(){
    }

    public HourContract(Double valuePerHour, Integer qtdHour, LocalDate date){
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
