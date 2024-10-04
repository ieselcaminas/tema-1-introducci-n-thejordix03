import java.util.Scanner;

//11. Crea un programa que pida al usuario dos números enteros y diga si ambos son pares.
// import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        int numero;
        int numero2;

        System.out.println("Escribe un numero para saber si es par o no");

        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        System.out.println("Escribe otro numero para saber si es par o no");

        numero2 = scan.nextInt();

        if (numero % 2 == 0 && numero2 % 2 == 0)
            System.out.println("Ambos numeros son pares");
    }
}
