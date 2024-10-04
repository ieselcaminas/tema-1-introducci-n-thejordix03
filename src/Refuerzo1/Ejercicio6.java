package Refuerzo1;// Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero, mostrará el
//resultado de dividir el primero entre el segundo. Por el contrario, si el segundo número es cero, escribirá
//"Error: No se puede dividir entre cero"
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String args[]) {

        double numero1;
        double numero2;
        double division;

        System.out.println("Escribe un numero entero");

        Scanner scan = new Scanner(System.in);

        numero1 = scan.nextInt();

        System.out.println("Escribe un segundo numero entero");

        numero2 = scan.nextInt();

        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero");
        } else {
            division = numero1 / numero2;
            System.out.println("La división de ambos números : " + division);
        }
    }
}
