package Refuerzo1;
//17. Crea un programa que pida al usuario dos números enteros y diga si son iguales o, en caso contrario, cuál
//es el mayor de ellos (F)
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;
        int numeroMayor = 0;

        System.out.println("Dime un numero:");
        numero = sc.nextInt();
        System.out.println("Dime un numero:");
        numero2 = sc.nextInt();

        if (numero > numero2 && numero > numeroMayor) {
            numeroMayor = numero;
        }else{
            numeroMayor = numero2;

        }
        if (numero == numero2) {
            System.out.println("Son iguales:");

        } else {
            System.out.println("Entre ambos numeros,el mayor es " + numeroMayor);

        }
    }
}
