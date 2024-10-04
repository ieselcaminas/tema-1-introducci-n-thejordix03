package Refuerzo1;//Crea un programa en java que pida al usuario un número entero y responda si es múltiplo de 2 o de 3.
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        int num1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero entero");

        num1 = scan.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de 2");
        }

        if (num1 % 3 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de 3");
        }

        if (num1 % 2 != 0  && num1 % 3 != 0) {
            System.out.println("El numero " + num1 + " NO ES MULTIPLO de 2 Y 3");
        }
    }
}
