package org.example;

import java.security.cert.X509Certificate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Una empresa ha instalado una nueva máquina expendedora de snacks y bebidas en su oficina. Para mejorar la experiencia de los empleados, quieren que el sistema:
        Muestre los productos disponibles y sus precios.
        Permita a los usuarios comprar varios productos en una sola sesión (Ingresar 5 productos).
        Maneje pagos en efectivo y devuelva el cambio correctamente.
        No permita compras si el usuario no tiene suficiente dinero.
        Ofrezca la opción de salir cuando el usuario termine
        */
        Scanner scanner = new Scanner(System.in);


        String prod1 = "Sake";
        int prec1 = 3400;
        String prod2 = "Pepsi";
        int prec2 = 2700;
        String prod3 = "7 up";
        int prec3 = 1500;
        String prod4 = "Takoyaki";
        int prec4 = 4000;
        String prod5 = "Gelatina de pata";
        int prec5 = 1200;
        boolean comprando =true;

        while (comprando){
            double total_compra =0;
            int contador =0;
            int maxiproduc =5;
            System.out.println("Bienvenido, escriba el numero del producto que desea consumir, maximo 5 productos por transaccion");
            System.out.println("""
                    1 -> Sake $3400
                    2 -> Pepsi $2700               
                    3 -> 7 up $1500
                    4 -> Takoyaki $4000
                    5 -> Gelatina de pata $1200
                    """);
            System.out.println("Ingrese el monto que va a usar");
            int pago = scanner.nextInt();
            while (contador < maxiproduc && comprando) {
                System.out.println("ingrese el producto a comprear o seleccione 0 para salir");
                int opcion = scanner.nextInt();

                if (opcion == 0) {
                    System.out.println("saliendo del programa");
                    comprando = false;
                    break;
                }

                if (opcion == 1) {
                    total_compra += prec1;
                    System.out.println(prod1 + "Agregado, su total es de " + total_compra);
                } else if (opcion == 2) {
                    total_compra += prec2;
                    System.out.println(prod2 + "Agregado, su total es de " + total_compra);
                } else if (opcion == 3) {
                    total_compra += prec3;
                    System.out.println(prod3 + "Agregado, su total es de " + total_compra);
                } else if (opcion == 4) {
                    total_compra += prec4;
                    System.out.println(prod4 + "Agregado, su total es de " + total_compra);
                } else if (opcion == 5) {
                    total_compra += prec5;
                    System.out.println(prod5 + "Agregado, su total es de " + total_compra);
                } else {
                    System.out.println("Ingrese una opcion valida");
                }
                contador++;
            }

            System.out.println("Total a Pagar $" + total_compra);
            if (pago >= total_compra) {
                    double vueltas = (pago - total_compra);
                    System.out.println("Compra Exitosa, Sus vueltas son $" + vueltas);
            } else {
                    System.out.println("Saldo Insuficiente");
            }
            int respuesta = scanner.nextInt();
            if (respuesta != 1) {
                    comprando = false;
            }
        }
    }
}