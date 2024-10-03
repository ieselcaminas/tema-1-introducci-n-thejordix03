package Refuerzo1;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        int casilla;
        int posicion = 0 ;
        int tirada ;
        int nuevaPosicion;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese tres numeros posiciones separados(1ºcasiilas 2ºposicion 3ºtirada del dado): ");

        while (true) {
            casilla = entrada.nextInt();
            posicion = entrada.nextInt();
            tirada = entrada.nextInt();

            if (casilla == 0 && posicion == 0 && tirada == 0) {
                break;
            }

            nuevaPosicion = posicion + tirada;

            if (nuevaPosicion > casilla) {
                nuevaPosicion = casilla;
            }

            System.out.println(nuevaPosicion);
        }
    }
}

