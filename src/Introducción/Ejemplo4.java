package Introducción;

import java.util.Scanner;
public class Ejemplo4 {
    public static void main (String argv[]) {
        float lado;
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el lado:");        
        lado = inputValue.nextFloat();
        
        inputValue.close();
        //Aquí usamos los datos obtenidos
        System.out.println(lado * lado);    
    }
}
