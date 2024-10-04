package Introducción;//7 Un programa que pida el precio real de un producto, el precio rebajado y muestre el descuento realizado (M)
import java.util.Scanner;
public class    Ejemplo7{
    public static void main(String args[]) {
    
   //variables
    double precio;
    double precio_rebajado;
    double descuento;
    
    Scanner inputValue = new Scanner(System.in);   
   
   //pide y lee el precio real 
    System.out.println("Introduce el precio real:");        
        precio = inputValue.nextDouble();
        
   //pide y lee el  precio rebajado
   
    System.out.println("Introduce el precio rebajado:");        
        precio_rebajado = inputValue.nextDouble();
    descuento = (precio - precio_rebajado)/precio * 100;
    
   //hace el calculo y muestra el descuento     
    System.out.println("EL descuento es:" + descuento);
        descuento = inputValue.nextDouble();
    
    }
}        

