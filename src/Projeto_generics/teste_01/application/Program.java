package Projeto_generics.teste_01.application;

import Projeto_generics.teste_01.service.PrintService;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantidade de valores:");
        int qtdValues = sc.nextInt();

        for (int i = 0; i < qtdValues ; i++){
            String name = sc.next();
            ps.addValue(name);
        }
        System.out.println(ps.first());
        ps.print();





        sc.close();
    }
}
