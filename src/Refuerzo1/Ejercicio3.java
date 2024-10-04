//Crea un programa que pida al usuario dos números enteros y diga si el primero es múltiplo del segundo
import java.util.Scanner;
public class    Ejercicio3{
    public static void main(String args[]) {

        int numero1;
        int numero2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe un numero ");
        numero1 = scan.nextInt();

        System.out.println("Escribe otro numero ");
        numero2 = scan.nextInt();

            if (numero1 % numero2==0) {
                System.out.println("El numero " + numero1 + " es multiplo del segundo");
            } else {
                System.out.println("El numero " + numero1+ " no es multiplo del segundo" );
            }

        }
    }