package enumsEx.Ex01.application;

import enumsEx.Ex01.entities.enums.Cores;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome de uma cor:(verde,amarelo,vermelho)");
        String nomeCor = input.next();
        Cores.valueOf(nomeCor.toUpperCase()).sinalizacao();




        input.close();
    }
}