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
        System.out.println("Ingrese el precio del hora: ");
        bruto =scan.nextInt();

        if(horas <= 35) {
            bruto = precio * horas;
        }else {
            bruto = 35 * precio + (horas - 35) * precio * 1.5;
        }
        if(bruto <= 500) {
            impuestos = 0;
        }else if (bruto<=900) {
            impuestos = (bruto - 500) * 0.25;
        }else{
            impuestos = (400 * 0.25)+ (bruto - 500 -400)* 0.45;
        }
        System.out.println("el salario bruto es "+ bruto);
        System.out.println("el salario impuestos es "+ impuestos);
        System.out.println("el slario neeto es"+ (bruto - impuestos));
    }
}
