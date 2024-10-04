package Introducción;//15 Realiza un programa que lea un número entero del 1 al 10 y que muestre su valor en letra. (F)
import java.util.Scanner;
public class    Ejemplo15{
    public static void main(String args[]) {
    
   //variables
    int num;
    
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee la nota
    System.out.println("Introduce la nota entera:");        
       num = inputValue.nextInt();
 
 switch (num) {
 case 0:  System.out.println("Cero");  
       
  case 1:  System.out.println("Uno");  
        break;
 
 case 2:  System.out.println("Dos");  
        break;
        
 case 3:  System.out.println("Tres");  
        break;

 case 4:  System.out.println("Cuatro");  
        break;
        
 case 5:  System.out.println("Cinco");  
        break;

 case 6:  System.out.println("Seis");  
        break;
        
 case 7:  System.out.println("Siete");  
        break;       

 case 8:  System.out.println("Ocho");  
        break;       

 case 9:  System.out.println("Nueve");  
        break;       

 case 10:  System.out.println("Diez");  
        break;       
  }
 }
}                                     
