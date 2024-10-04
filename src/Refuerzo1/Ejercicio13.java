
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        int numero2;

        System.out.println("Escribe un numero ");

        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        System.out.println("Escribe otro numero ");

        numero2 = scan.nextInt();

        if (numero % 2 + numero2 % 2 == 1)
            System.out.println("Solo uno es par");
    }
}