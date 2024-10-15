import java.util.Scanner;
// Diseña un algoritmo que calcule el salario neto de un trabajador en función del número de horas de trabajo y los impuestos según las siguientes reglas:
public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        double precio;
        double bruto;
        double impuestos;

        System.out.println("Ingrese el precio por hora(€)");
        precio = sc.nextDouble();
        System.out.println("Ingrese el num de horas");
        horas = sc.nextInt();

        if(horas<35){
            bruto = precio * horas;
        }else{
            bruto = precio * horas * 1.5;
        }



    }
}
