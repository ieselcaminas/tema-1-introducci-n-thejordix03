package Introducción;
import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {

        int binario;
        int decimal = 0;
        int resto;
        int potencia = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número binario: ");
        binario = entrada.nextInt();

        while (binario > 0) {

            resto = binario % 10;
            decimal += resto * potencia;
            binario /= 10;
            potencia *= 2;

        }
        System.out.println("El número en decimal es: " + decimal);
    }
}

