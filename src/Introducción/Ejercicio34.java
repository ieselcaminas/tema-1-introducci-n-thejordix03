package Introducción;

import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {

        int num;
        int num2;
        int total = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("introduce un numero : ");
        num = scan.nextInt();

        System.out.println("introduce otro numero : ");
        num2 = scan.nextInt();

        for (int i = 1;
             i <= num2;
             i++) {
            total = total + num;
        }
        System.out.println(total);
    }
}