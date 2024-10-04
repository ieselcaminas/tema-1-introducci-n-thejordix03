package Introducción;//12 Diseña un algoritmo que lea dos valores y muestre el más grande de ellos. (F)
import java.util.Scanner;
public class    Ejemplo12{
    public static void main(String args[]) {
    
   //variables
    int x;
    int y;
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee los valores
    System.out.println("Introduce los valores:");        
       x = inputValue.nextInt();
       y = inputValue.nextInt();
        
   //Condicional Si SE CUMPLE pasa esto si no PASA LO OTRO
    if (x > y) {
    
    System.out.println(x);
    
    }else{
    
    System.out.println(y);
    }
    
  }
}  
