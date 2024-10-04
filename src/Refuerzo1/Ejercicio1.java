package Refuerzo1;//Escribe un programa Java que dado un número entero obtiene:

import java.util.Scanner;
public class    Ejercicio1{
    public static void main(String args[]) {

        int numero;
        int numerodoble;
        int numerotriple;

        System.out.println("Escribe un numero para darte el doble y el triple") ;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();
        numerodoble = numero * 2 ;
        numerotriple = numero * 3 ;

        System.out.println("El doble de " + numero + "es " + numerodoble) ;
        System.out.println("El triple de " + numero + "es " + numerotriple) ;

    }
}