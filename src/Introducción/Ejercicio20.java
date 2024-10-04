package Introducción;
//Un cierto comercio hace un descuento dependiendo del precio de cada producto.
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {

        double precio;
        double descuento;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la oprecion: ");
        precio = scan.nextDouble();

        if (precio < 6) {
            System.out.println("No hay descuento: ");

        } else if (precio >= 6 && precio < 60) {
            descuento = precio * 0.5;
            System.out.println("con descuento del 5% tienes de precio final===  " + descuento  );

        } else if (precio >= 60 && precio > 60) {

            descuento = precio * 0.90  ;

            System.out.println("con descuento del 10% tienes de precio final===  " + descuento  );

        }
    }
}
