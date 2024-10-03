package Refuerzo1;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {

        int casosdeprueba;
        int saldo = 0;
        int cambio = 0;
        int saldofinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon casos de preuba)");
        casosdeprueba = scanner.nextInt();

        for (int i = 0; i < casosdeprueba; i++) {

            saldofinal = saldo + cambio;

            if (saldofinal >= 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}

