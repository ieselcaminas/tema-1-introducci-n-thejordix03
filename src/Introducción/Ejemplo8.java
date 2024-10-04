package Introducción;//8 Realiza un programa que pida la edad al usuario y muestre un mensaje si es mayor de edad (F)
import java.util.Scanner;
public class    Ejemplo8{
    public static void main(String args[]) {
    
   //variables
    int edad;
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee la edad
    System.out.println("Introduce tu edad:");        
        edad = inputValue.nextInt();
        
   //Condicional Si SE CUMPLE pasa esto si no PASA LO OTRO
    if (edad >=18) {
    
    System.out.println("Eres mayor de edad.");
    
    }else{
    
    System.out.println("No eres mayor de edad.");
    }
    
  }
}        


