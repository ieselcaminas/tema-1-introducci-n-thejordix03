package Refuerzo3;
import java.util.Scanner;
public class Ejercicio153 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n1;
        double n2;

        System.out.print("pon un num: ");
         n1 = in.nextDouble();

        System.out.print("pon otro num ");
         n2 = in.nextDouble();

        if(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1) {
            System.out.print("verdadero ");
        }else{
            System.out.print("falso ");

        }

    }
}



