//Angie Lorena Jimenez Porras (:

package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        Simula un cajero automatico con $50000 de saldo inicial.
        El usuario puede:

        Consultar saldo
        Ingresar Dinero
        Retirar dinero
        Salir
        * */

        int cantidad=50000;
        int cajero= 50000;
        int s=0;
        do {
            System.out.println("""
                    ingresa una opcion: 
                    1 consultar saldo
                    2 ingresar dinero 
                    3 retirar dinero 
                    4 salir
                    """);
                s = Scanner.nextInt();
                switch (s) {
                    case 1 -> {
                        System.out.println("la cantidad actual es: " + cajero);
                    }
                    case 2 -> {
                        System.out.println("ingrese el valor: ");
                        int ingreso = Scanner.nextInt();
                        cajero = ingreso + cantidad;

                    }
                    case 3 -> {
                        System.out.println("¿Cuanto dinero desea retirar? ");
                        int retiro = Scanner.nextInt();
                        if (cajero >= retiro) {
                            cajero = cajero - retiro;
                        } else System.out.println("No tiene esa cantidad disponible");

                    }
                    case 4-> {
                        System.out.println("ha salido del programa");

                    }
                    default -> System.out.println("ingrese una opcion valida");
                }
            } while (s != 4);
    }
}