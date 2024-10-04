package Introducción;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {

        int horas ;
        double precio;
        double bruto;
        double impuestos;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el valor de horas: ");
        precio = scan.nextDouble();
        System.out.println("Ingrese las horas ");
        horas = scan.nextInt();
        bruto =scan.nextInt();

        if(horas <= 35){
            bruto = precio * horas;
        }

    }




}
