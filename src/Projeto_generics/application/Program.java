package Projeto_generics.application;

import Projeto_generics.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String strFile = "c:\\users\\Herbert\\Documents\\arquivos\\Products_values.csv";
        List<Product> productList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {
            String line = br.readLine();
            while (line != null) {
               String[] fields = line.split(",");
               productList.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Product max =
    }
}
