package projeto_Excecoes.projeto_01.application;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class builderReservation {

    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public builderReservation(DateTimeFormatter fmt, Scanner sc) {
        this.fmt = fmt;
        this.sc = sc;
    }
}
