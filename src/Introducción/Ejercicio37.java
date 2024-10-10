package Introducción;
import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {

        int binario ;
        int decimal = 0;
        int residuo;
        int potencia = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número binario: ");
        binario = entrada.nextInt();

        do {
            residuo = binario % 10;
            decimal += residuo * potencia;
            binario /= 10;
            potencia *= 2;
        } while (binario > 0);

        System.out.println("El número " + binario + " en decimal es: " + decimal);

    }
}
