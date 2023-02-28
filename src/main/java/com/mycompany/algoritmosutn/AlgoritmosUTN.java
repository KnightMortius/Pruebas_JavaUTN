package com.mycompany.algoritmosutn;
import java.util.Scanner;

public class AlgoritmosUTN {

    public static void main(String[] args) {
        //Entrada por teclado de usuario - Scanner
        Scanner entrada = new Scanner(System.in);
        
        int numeroInicio = 0, numeroFin = 20;

        System.out.println("Consigna 1 - A: ");
        //Comienzo de la consigna Nº1 A - Muestra de numeros
        while (numeroInicio < numeroFin) {
            System.out.print(numeroInicio + ", ");
            numeroInicio++;
        }
        
        System.out.println(numeroInicio);

        System.out.println("---------------------------");
        System.out.println("");

        System.out.println("Consigna 1 - B: ");
        
        //Comienzo de la consigna Nº1 B - Muestra de numeros pares
        for (numeroInicio = 0; numeroInicio < numeroFin; numeroInicio += 2) {
            System.out.print(numeroInicio + ", ");
        }
        System.out.print(numeroInicio);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        System.out.println("Consigna 1 - C: ");

        //Comienzo de la consigna Nº1 C - Entrada de usuario para decidir entre numeros pares e impares
        System.out.println("Ingresar si desea 1 - numeros impares / 2 - numeros pares");
        int numerosVariable = entrada.nextInt();

        if (numerosVariable == 1) {
            numeroInicio = 0;
            numeroInicio += 1;
            numeroFin = 19;

            while (numeroInicio < numeroFin) {
                System.out.print(numeroInicio + ", ");
                numeroInicio += 2;
            }
            System.out.print(numeroInicio);
        } else if (numerosVariable == 2) {
            numeroInicio = 0;
            numeroFin = 20;
            
            for (numeroInicio = 0; numeroInicio < numeroFin; numeroInicio += 2) {
                System.out.print(numeroInicio + ", ");
            }
        System.out.print(numeroInicio);
        }

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("Consigna 1 - D: ");

        //Comienzo de la consigna Nº1 D - Muestra de numeros pares invertido
        numeroInicio = 0;

        for (numeroFin = 20; numeroFin > 2; numeroFin -= 2) {
            System.out.print(numeroFin + ", ");
        }
        System.out.print(numeroFin);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("Consigna 2: ");
        
        //Comienzo de la consigna Nº2 - Condicional If / Else para saber si tiene ingresos altos o no.
        float ingresos = 580351.24f;
        int vehiculos = 3;
        int antigüedadVehiculos = 3;
        int economiaPlena = 1;
        
        if (ingresos >= 489083) {
            if (vehiculos == 3 && antigüedadVehiculos <= 5) {
                if (economiaPlena == 1) {
                    System.out.println("Se considera como un hogar con ingresos altos.");
                }
            }
        } else {
            System.out.println("No se considera como un hogar con ingresos altos.");
        }
    }
}
