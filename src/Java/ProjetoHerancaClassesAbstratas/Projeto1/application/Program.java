package ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.application;

import ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.modal.entities.Circle;
import ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.modal.entities.Color;
import ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.modal.entities.Rectangle;
import ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.modal.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shape = new ArrayList<>();
        System.out.print("Digite o numero de formas:");
        int qtdShapes = sc.nextInt();

        for (int i = 0; i < qtdShapes; i++) {
            System.out.println("Forma #" + (i + 1) + ":");
            System.out.print("Retangulo ou circulo(r/c):");
            char choiceShape = sc.next().charAt(0);
            System.out.print("Digite a cor:(PRETO/AZUL/VERMELHO)");
            String color = sc.next();
            if (choiceShape == 'r') {
                System.out.print("Digite a altura:");
                double height = sc.nextDouble();
                System.out.print("Digite o comprimento:");
                double width = sc.nextDouble();
                shape.add(new Rectangle(Color.valueOf(color),height,width));
            } else if (choiceShape == 'c') {
                System.out.print("Digite o raio:");
                double radius = sc.nextDouble();
                shape.add(new Circle(Color.valueOf(color), radius));
            }
            else {
                System.out.println("Nao existe essa forma");
            }
        }
        for (Shape sp : shape) {
            System.out.print("\nArea:"+sp.area());
        }
    }
}
