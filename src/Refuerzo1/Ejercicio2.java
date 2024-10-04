package Refuerzo1;//2. Crea un programa que pida al usuario un número entero y diga si es par

import java.util.Scanner;
public class    Ejercicio2 {
    public static void main(String args[]) {

        int numero;

        System.out.println("Escribe un numero para saber si es par o no");

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero "  + numero + " es par" +
                    "es par ");
        } else {
            System.out.println("El numero " + numero + " no es par ");
        }

    }
}