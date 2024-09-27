package Refuerzo1;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int distancia = 0 ;
        double velocidadMaxima;
        double tiempo = 1 ;
        double velocidadMedia = (distancia / 1000.0) / (tiempo / 3600.0);



        System.out.println("Distancia");
        distancia = scanner.nextInt();

        System.out.println("V max");
        velocidadMaxima = scanner.nextInt();

        System.out.println("tiempo");
        tiempo = scanner.nextInt();

        if (tiempo <= 0) {
                System.out.println("ERROR");
        }
        if (velocidadMedia <= velocidadMaxima) {
            System.out.println("OK");

        } else if (velocidadMedia <= velocidadMaxima * 1.2) {
            System.out.println("MULTA");

        } else {
            System.out.println("PUNTOS");
        }
    }
}














