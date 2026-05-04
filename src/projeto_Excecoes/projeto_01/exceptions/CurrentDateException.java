package projeto_Excecoes.projeto_01.exceptions;

import java.time.LocalDate;

public class CurrentDateException extends Exception {

    private final LocalDate invalidDate;

    public CurrentDateException(LocalDate date) {
        super("A data não pode ser inferior a atual");
        this.invalidDate = date;
    }

    public LocalDate getInvalidDate(){
        return invalidDate;
    }
}
