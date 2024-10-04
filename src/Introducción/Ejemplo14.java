package Introducción;//14 Diseña un algoritmo que lea un valor numérico entero correspondiente a la nota de un examen y muestre su valor en letra: (M)
import java.util.Scanner;
public class    Ejemplo14{
    public static void main(String args[]) {
    
   //variables
    int nota;
    
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee la nota
    System.out.println("Introduce la nota entera:");        
       nota = inputValue.nextInt();
 
       
   //Condicional Si SE CUMPLE pasa esto si no PASA LO OTRO 
   //|| = o 
   //& = y
    if ((nota < 0) || (nota > 10)) {
    System.out.println("Nota invalida");
    }else{
    
    if (nota < 3) {
    System.out.println("Muy deficiente");
    }else{
    
    if (nota < 5) {
    System.out.println("Insuficiente");
    }else{
    
    if (nota < 6) {
    System.out.println("Bien");
    }else{
    
    if (nota < 7) {
    System.out.println("Bien");
    }else{
    
    if (nota < 8) {
    System.out.println("Notable");
    }else{
    
    if (nota < 9) {
    System.out.println("Notable");
    }else{
    
    if (nota < 10) {
    System.out.println("Excelente");
    }else{
    }
    if (nota == 10) {
    System.out.println("Excelente");
    }else{
    }
    }
    }
    }
    }
    }
    }
    }
   
  }
}  
