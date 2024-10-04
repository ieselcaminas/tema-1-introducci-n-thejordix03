package Introducción;

import java.util.Scanner;
public class Ejemplo6 {
    public static void main (String argv[]) {
        int radio;
        double area;
        double perimetro;
        
        Scanner inputValue = new Scanner(System.in);
       
        System.out.println("Introduce el Radio");
        radio = inputValue.nextInt();
        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;
        
         System.out.println("El area es " + area);
         System.out.println("El perimetro es " + perimetro);
        
        inputValue.close();
        //Aquí usamos los datos obtenidos
           
    }
}

