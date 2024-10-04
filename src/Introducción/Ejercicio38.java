package Introducción;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio38 {
    public static void main(String[] args) {

        int intento;
        int secreto;
        Random aleatorio = new Random(System.currentTimeMillis());
       secreto = aleatorio.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Introduce un número entre 1 y 100, o -1 para rendirte.");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento == -1) {
                System.out.println("Se rinde. El número secreto era: " + secreto);
                break;
            } else if (intento == secreto) {
                System.out.println("¡Has Ganado!");
                break;
            } else if (intento > secreto) {
                System.out.println("El número secreto es más pequeño.");
            } else {
                System.out.println("El número secreto es más grande.");
            }
        } while (intento != secreto);
    }
}
