package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el número para convertir unidades:");
        System.out.println("""
                1-> Fahrenheit a Celsius    
                2-> Celsius a Fahrenheit
                3-> Kelvin a Celsius    
                4-> Celsius a Kelvin    
                5-> Kelvin a Fahrenheit     
                6-> Fahrenheit a Kelvin
                7-> Rankine a Fahrenheit    
                8-> Fahrenheit a Rankine
                9-> Reaumur a Celsius       
                10-> Rankine a Kelvin
                11-> Rankine a Celsius      
                12-> Celsius a Rankine
                13-> Celsius a Reaumur      
                14-> Kelvin a Rankine
                15-> Fahrenheit a Reaumur   
                16-> Reaumur a Fahrenheit
                """);

        int opcion = scanner.nextInt();
        if (opcion < 1 || opcion > 16) {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.println("Ingrese la cantidad a convertir:");
        double cantidad = scanner.nextDouble();
        double conversion = 0;

        if (opcion == 1) {
            conversion = (5 * (cantidad - 32)) / 9;
        } else if (opcion == 2) {
            conversion = (9 * cantidad) / 5 + 32;
        } else if (opcion == 3) {
            conversion = cantidad - 273.15;
        } else if (opcion == 4) {
            conversion = cantidad + 273.15;
        } else if (opcion == 5) {
            conversion = (9 * (cantidad - 273.15)) / 5 + 32;
        } else if (opcion == 6) {
            conversion = (5 * (cantidad - 32)) / 9 + 273.15;
        } else if (opcion == 7) {
            conversion = cantidad - 459.67;
        } else if (opcion == 8) {
            conversion = cantidad + 459.67;
        } else if (opcion == 9) {
            conversion = (5 * cantidad) / 4;
        } else if (opcion == 10) {
            conversion = (5 * (cantidad - 491.67)) / 9 + 273.15;
        } else if (opcion == 11) {
            conversion = (5 * (cantidad - 491.67)) / 9;
        } else if (opcion == 12) {
            conversion = (9 * cantidad / 5) + 491.67;
        } else if (opcion == 13) {
            conversion = (4 * cantidad) / 5;
        } else if (opcion == 14) {
            conversion = (9 * (cantidad - 273.15)) / 5 + 491.67;
        } else if (opcion == 15) {
            conversion = (4 * (cantidad - 32)) / 9;
        } else if (opcion == 16) {
            conversion = (9 * cantidad) / 4 + 32;
        }

        System.out.println("La conversion es: " + conversion);
    }
}
