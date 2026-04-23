package projeto_POO.projeto_01.application;

import projeto_POO.projeto_01.model.entities.*;
import projeto_POO.projeto_01.model.enums.TypeDepartment;
import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class WorkertBuilder {
    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public WorkertBuilder(DateTimeFormatter fmt, Scanner sc){
        this.fmt = fmt;
        this.sc = sc;
    }

    public WorkerLevel readLevel(){
        int indexLevel = readInt("Nivel-[1-JUNIOR;2-PLENO;3-SENIOR]:");
        return WorkerLevel.fromCode(indexLevel);
    }


    public Department createDepartment() {
            int indexDepartment = readInt("Digite o departamento:[1-Administracao/2-Vendas/3-Recepcao]");
            TypeDepartment type = TypeDepartment.fromCode(indexDepartment);
            return switch (type) {
                case ADMINISTRACAO -> createAdminDept();
                case VENDAS -> createSalesDept();
                case RECEPCAO -> createRecepcionDept();
            };
        }

    public Worker readWorker() {
        System.out.print("Nome: ");
        String name = sc.nextLine();
        LocalDate birthday = readDate("Data de nascimento (DD/MM/YYYY):");
        int daysWork = readInt("Digite os dias trabalhados:");
        return new Worker(name, birthday, daysWork,createDepartment());
    }

    public Department createAdminDept(){
        int qtdProjects = readInt("Digite a quantidade de projetos feitos:");
        return new AdminDept(readLevel(),qtdProjects);
    }

    public Department createSalesDept(){
        int qtdSales = readInt("Digite a quantidade de vendas realizadas:");
        return new SalesDept(readLevel(),qtdSales);
    }

    public Department createRecepcionDept(){
        int qtdPeoplesAtt = readInt("Digite a quantidade de pessoas atendidas:");
        return new RecepcionDept(readLevel(),qtdPeoplesAtt);
    }

    public int readInt(String prompt){
        do {
            try{
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Formato incorreto.Digite um numero inteiro.");
            }
        }while(true);
    }

    public Double readDouble(String prompt){
        do {
            try{
                System.out.print(prompt);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("Formato incorreto.Digite um numero real.");
            }
        }while (true);
    }

    public LocalDate readDate(String prompt){
        do {
            try {
                System.out.print(prompt);
                return LocalDate.parse(sc.nextLine().trim(),fmt);
            }catch (DateTimeParseException e){
                System.out.println("Formato incorreto de data.Utilize (dd/MM/yyyy)");
            }
        }while(true);
    }

}
