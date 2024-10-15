package Introducción;
//Realiza un programa que calcule el resto de una división usando el método de las restas sucesivas.
import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {

        int num;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("introduce el dividendo : ");
        num = scan.nextInt();

        System.out.println("introduce el divisor: ");
        num2 = scan.nextInt();
        if (num2 == 0) {
            System.out.println("El divisor no puede ser cero.");
        } else {
            // Realizamos la resta sucesiva
            while (num >= num2) {
                num -= num2;
            }
            System.out.println("El resto es: " + num);
        }
    }
}


