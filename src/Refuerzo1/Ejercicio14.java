import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        int num1 ;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {

            System.out.println("Los dos son positivos");
        }else if (num1 < 0 && num2 < 0) {
            System.out.println("Los dos son negativos");
        }else{
            System.out.println("Uno de los numeros es positivo");
        }
    }
}
