package Introducción;
import java.util.Scanner;
//saber si el num es primo o no
public class Ejercicio28 {
    public static void main(String[] args) {
        int num;
        boolean primo = true;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();

        if (num == 2) {
            primo = true;
            System.out.println("El numero es primo");
        }else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}

