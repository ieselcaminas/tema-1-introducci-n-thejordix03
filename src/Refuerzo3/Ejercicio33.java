package Refuerzo3;
import java.util.Scanner;
//33. Write a Java program and compute the sum of an integer's digits.
public class Ejercicio33 {
    public static void main(String[] args) {

        int suma = 0;
        long num;
        long digito;

        Scanner scanner = new Scanner(System.in);

        System.out.print("pon una integral ");
        num = scanner.nextInt();

        do {
            digito = num % 10;
            suma += digito;
            num = num / 10;
        } while (num > 0);
        System.out.println(suma);
    }
}
