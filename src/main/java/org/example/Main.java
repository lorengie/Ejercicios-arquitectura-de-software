package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
         La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
         Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
          Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico
         (buscar su efectividad)
          El programa recibe los siguientes parámetros:
        Tipo del Pokémon atacante.
          Tipo del Pokémon defensor.
         Ataque: Entre 1 y 100.
         Defensa:Entre1y100.

         */
        Scanner scanner = new Scanner(System.in);
        double efecto_ataque= 1.0;

        System.out.println("""
                Selecciona el pokemon atacante: 
                1 Agua 
                2 Fuego
                3 Planta
                4 Eléctrico
                """);
        int tipo_ataque = scanner.nextInt();
        System.out.println("""
                Ahora selecciona el tipo de pokemon defensor 
                1 agua
                2 fuego
                3 planta
                4 eléctronico
                """);
        int tipo_defensa= scanner.nextInt();

        System.out.println("Digite el valor del ataque debe ser entre 1 a 100");
        int valor_ataque =scanner.nextInt();

        System.out.println("Digite el valor de la defensa debe ser entre1 a 100");
        int valor_defensa= scanner.nextInt();
        if (valor_ataque<1 ||valor_ataque>100 || valor_defensa<1 || valor_defensa>100){
            System.out.println("Eror selecciona una opcion valida de defensa  o ataque");
        };
        if (tipo_ataque == 1) {
            if (tipo_defensa == 1) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 2) {
                efecto_ataque = 2.0;
            } else if (tipo_defensa == 3) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 4) {
                efecto_ataque = 1.0;
            }
        } else if (tipo_ataque == 2) {
            if (tipo_defensa == 1) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 2) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 3) {
                efecto_ataque = 2.0;
            } else if (tipo_defensa == 4) {
                efecto_ataque = 1.0;
            }
        } else if (tipo_ataque == 3) {
            if (tipo_defensa == 1) {
                efecto_ataque = 2.0;
            } else if (tipo_defensa == 2) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 3) {
                efecto_ataque = 0.5;
            } else if (tipo_defensa == 4) {
                efecto_ataque = 1.0;
            }
        } else if (tipo_ataque == 4) {
            if (tipo_defensa == 1) {
                efecto_ataque = 2.0;
            } else if (tipo_defensa == 2) {
                efecto_ataque = 1.0;
            } else if (tipo_defensa == 3) {
                efecto_ataque = 1.0;
            } else if (tipo_defensa == 4) {
                efecto_ataque = 0.5;
            }
        } else {
            System.out.println("Error: Tipo de Pokémon atacante no válido.");
        }
        double danio= 50*((double)efecto_ataque/tipo_defensa)*efecto_ataque;
        System.out.println("El daño en la batalla es de "+ danio);
        }

}
