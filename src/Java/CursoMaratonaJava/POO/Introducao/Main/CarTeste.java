package CursoMaratonaJava.POO.Introducao.Main;

import CursoMaratonaJava.POO.Introducao.Domain.Car;

public class CarTeste {
    public static void main(String[] args){

        Car car1 = new Car() ;
        car1.setName("Uno");
        car1.setModel("Fiat");
        car1.setYear(2008);
        System.out.println("Carro: "+car1.getName()+" Model: "+ car1.getModel()+" Ano:" +car1.getYear());
    }
}
