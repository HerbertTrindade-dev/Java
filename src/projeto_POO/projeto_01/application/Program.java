package projeto_POO.projeto_01.application;

import projeto_POO.projeto_01.model.entities.*;
import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);



        for (Worker wk : workers){
            System.out.println("------------------------------");
            System.out.println("======RELATORIO SALARIAL======");
            System.out.println("Nome:"+wk.getName());
            System.out.println("Data de nascimento:"+wk.getBirthday());
            System.out.println("Departamento:"+wk.getDepartment().getName());
            System.out.println("Senioridade:"+wk.getDepartment().getLevel());
            System.out.println("Bonus: R$"+wk.bonusAmount());
            System.out.println("Salario: R$"+wk.salary());


        }


    }
}
