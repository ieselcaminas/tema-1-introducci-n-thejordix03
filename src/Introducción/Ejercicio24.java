package Introducción;

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumarNotas = 0;
        int contar = 0;
        boolean hayDiez = false;
        int nota;

        do {
            System.out.print("Introduce una nota:  ");
            nota = scanner.nextInt();

            if (nota != -1) {
                sumarNotas += nota;
                contar++;

                if (nota == 10) {
                    hayDiez = true;
                }
            }
        } while (nota != -1);

        if (contar > 0) {
            double media = sumarNotas / contar;
            System.out.printf("La nota media es: " + media + "...");
        }
        if (hayDiez) {
            System.out.println("Se ingresó al menos un 10.");
        }
    }
}