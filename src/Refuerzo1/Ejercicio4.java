package Refuerzo1;// Crea un programa que pida al usuario un número entero. Si es múltiplo de 10, informará al usuario y pedirá
//un segundo número, para decir a continuación si este segundo número también es múltiplo de 10.
import java.util.Scanner;
public class Ejercicio4 {

        public static void main(String args[]) {

            int numero1;
            int numero2;

            System.out.println("Escribe un numero entero que sea multiplo de 10");

            Scanner scan = new Scanner(System.in);

            numero1 = scan.nextInt();

            if (numero1 % 10 == 0) {

                System.out.println("El numero " + numero1 + " es multiplo de 10");

                System.out.println("Escribe un numero entero ");
                numero2 = scan.nextInt();

                if (numero2 % 10 == 0) {
                    System.out.println("El numero " + numero2 + " es multiplo de 10");
                } else {
                    System.out.println("No es multiplo de 10");
                }
            } else {
                System.out.println("No es multiplo de 10");
            }

        }
}
