package Refuerzo3;
import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n\nDividido por 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n\n Dividido por 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");
    }
}