package Refuerzo3;
import java.util.Scanner;
//86. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1
public class Ejercicio86 {
    public static void main(String[] args) {

        int num1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un num: ");
        num1 = scanner.nextInt();

        do {
            if (num1 % 2 == 0) {
                num1 /= 2;
                System.out.println(num1);
            } else if (num1 % 2 == 1) {
                num1 *= 3;
                num1++;
                System.out.println(num1);

            }
            }while(num1 != 1);
        System.out.println("Valor del numero" +  num1);
        }
    }