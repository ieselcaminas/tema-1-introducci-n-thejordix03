package Refuerzo1;
import java.util.Scanner;
//16. Crea un programa que pida al usuario tres números y muestre cuál es el mayor de los tres.
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int mayor = 0;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = sc.nextInt();

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num1> num2 && num1>num3) {
            mayor = num1;
        }
        System.out.println("El primer numero mayor es " + mayor);

    }
}
