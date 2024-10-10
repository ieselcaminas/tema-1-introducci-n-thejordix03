package Introducción;
import java.util.Scanner;
//Realiza un programa que lea un número entero decimal (máximo 255) e imprima su valor en binario
public class Ejercicio36 {
    public static void main(String[] args) {

        int decimal;
        int residuo;
        String binario ="";

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número decimal (máximo 255): ");
        decimal = entrada.nextInt();

        if (decimal < 0 || decimal > 255) {
            System.out.println("Error: El número debe estar entre 0 y 255.");
            return;
        }
        if (decimal == 0) {
            binario = "0";
        } else {
            do {
                residuo = decimal % 2;
                binario = residuo + binario;
                decimal /= 2;
            } while (decimal > 0);
        }
        System.out.println("El número " + decimal + " en binario es: " + binario);
    }
}