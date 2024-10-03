package Introducción;

import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {

        int n ;

        Scanner scan = new Scanner(System.in);

        System.out.println("introduce un numero n : ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }
}