package Introducción;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número natural: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, introduce un número natural positivo.");
        } else {
            System.out.println("Los divisores de " + numero + " son:");

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
