package Introducción;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {

        int num;
        int positives = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese un numero: ");
            num = scan.nextInt();

            if (num > 0) {
                positives ++;
            }
        }
        System.out.println("positivos : " +positives);

    }
}
