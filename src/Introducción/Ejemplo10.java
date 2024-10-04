package Introducción;//10 Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo) (F)
import java.util.Scanner;
public class    Ejemplo10{
    public static void main(String args[]) {
    
   //variables
    int x;
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee el valor
    System.out.println("Introduce el valor:");        
       x = inputValue.nextInt();
        
   //Condicional Si SE CUMPLE pasa esto si no PASA LO OTRO
    if (x >=0) {
    
    System.out.println("Es positivo.");
    
    }else{
    
    System.out.println("No es positivo.");
    }
    
  }
}        

