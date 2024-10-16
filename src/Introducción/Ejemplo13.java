package Introducción;//13 Realiza un programa que lea dos valores y los orden ascendente o descendentemente según elija el usuario. (M)
import java.util.Scanner;
public class    Ejemplo13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int decision;
        int temp;

        System.out.print("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        num2 = sc.nextInt();
        System.out.print("Ingresa 1 para que sea ascendente o 0 para descendente: ");
        decision = sc.nextInt();

        if (decision == 1) {
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("Números ordenados en orden Ascendente: " + num1 + ", " + num2);
        }
        if (decision == 0) {
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("Números ordenados en orden Descendente: " + num1 + ", " + num2);
        }
    }
}
    
