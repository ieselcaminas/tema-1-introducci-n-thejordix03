package Refuerzo3;
import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        boolean comprobacion;

        Scanner scanner = new Scanner(System.in);

        System.out.print("primer num: ");
        num1 = scanner.nextInt();

        System.out.print("segundo num ");
        num2 = scanner.nextInt();

        System.out.print("tercer num ");
        num3 = scanner.nextInt();

        comprobacion = (num1 + num2) == num3;
        System.out.println("Resultado es " + comprobacion);
    }
}