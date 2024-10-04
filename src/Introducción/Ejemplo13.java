package Introducción;//13 Realiza un programa que lea dos valores y los orden ascendente o descendentemente según elija el usuario. (M)
import java.util.Scanner;
public class    Ejemplo13{
    public static void main(String args[]) {
    
   //variables
    int x;
    int y;
    int decision;
    
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee los valores
    System.out.println("Introduce los valores:");        
       x = inputValue.nextInt();
       y = inputValue.nextInt();
       
   //eleccion
   System.out.println("Elige en 1 - ascendente o 2 - descendente:");        
      decision = inputValue.nextInt();
       
   //Condicional Si SE CUMPLE pasa esto si no PASA LO OTRO
    if (decision == 1) {
    System.out.println(x + " " + y);
    
    }else{
    
    System.out.println(y + " " + x);
    }
    
    if (decision == 2) {
    System.out.println(y + " " + x);
    
    }else{
    
    System.out.println(x + " " + y);
    }
    
  }
}  
