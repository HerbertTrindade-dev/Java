package ProjetoHerancaPolimorfismo.Projeto1.application;

import ProjetoHerancaPolimorfismo.Projeto1.entities.Employee;
import ProjetoHerancaPolimorfismo.Projeto1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        System.out.print("Digite o numero de funcionarios:");
        int quantityEmployee = sc.nextInt();
        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("--------------------------");
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Terceiro?[S/N]");
            char isOutSource = sc.next().charAt(0);
            System.out.print("Nome:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas:");
            int hours = sc.nextInt();
            System.out.print("Valor por hora: R$");
            double valuePerHour = sc.nextDouble();
            if (isOutSource == 'S') {
                System.out.print("Valor das despesas adicionais: R$");
                double chargeAdditional = sc.nextDouble();
                Employee outSourceEmployee = new OutsourcedEmployee(name, hours, valuePerHour, chargeAdditional);
                employees.add(outSourceEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }
        System.out.println("------------------------");
        for (Employee emp : employees) {
            System.out.print("\nNome:"+emp.getName()+" - Valor total R$: "+emp.payment());
        }


        sc.close();
    }
}
