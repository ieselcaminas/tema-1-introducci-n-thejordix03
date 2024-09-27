package Refuerzo2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        int dia = 0;
        int mes = 0;
        int diash = 0;
        int[] diaspormes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Que dia es hoy?");
        dia = scanner.nextInt();

        System.out.println("Que numero de mes estamos?");
        mes = scanner.nextInt();

        for (int i = mes + 1; i < 12; i++) {
            diash += diaspormes[i];
        }
        System.out.println("faltan " + diash + " dias para nochevieja");
    }
}