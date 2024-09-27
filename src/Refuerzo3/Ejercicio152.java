package Refuerzo3;
import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;

        Scanner in = new Scanner(System.in);

        System.out.print("Pon el primer numero: ");
         num1 = in.nextInt();

        System.out.print("Pon el segundo num");
         num2 = in.nextInt();

        System.out.print("el tercer num: ");
         num3 = in.nextInt();

        System.out.print("el cuarto num: ");
         num4 = in.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Son iguales.");
        } else {
            System.out.println("no son iguales");
        }

    }
}

