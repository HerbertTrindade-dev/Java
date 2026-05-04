package projeto_Excecoes.projeto_01.exceptions;

import java.time.LocalDate;

public class CurrentDateException extends Exception {

    private final LocalDate invalidDate;

    public CurrentDateException(LocalDate date, LocalDate dateNow) {
        super("A data "+date+" não pode ser inferior a  data atual"+dateNow);
        this.invalidDate = date;
    }

    public LocalDate getInvalidDate(){
        return invalidDate;
    }
}
