package projeto_Excecoes.projeto_01.application;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class builder {

    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public builder(DateTimeFormatter fmt, Scanner sc) {
        this.fmt = fmt;
        this.sc = sc;
    }
}
