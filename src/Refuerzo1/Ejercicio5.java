package Refuerzo1;//5. Crea un programa que multiplique dos números enteros de la siguiente forma: pedirá al usuario un primer
//número entero. Si el número que se que teclee es 0, escribirá en pantalla "El producto de 0 por cualquier
//número es 0". Si se ha tecleado un número distinto de cero, se pedirá al usuario un segundo número y se
//mostrará el producto de ambos.

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String args[]) {

        int numero1;
        int numero2;
        int producto;

        System.out.println("Escribe un numero entero");

        Scanner scan = new Scanner(System.in);

        numero1 = scan.nextInt();

        if (numero1 ==0) {
            System.out.println("El producto de 0 por cualaquier numero es 0");

        } else {
            System.out.println("Dame un segundo numero");
        }
        numero2 = scan.nextInt();

        producto=numero1 * numero2;
        System.out.println("El producto de ambos números és " + producto );

    }
}
