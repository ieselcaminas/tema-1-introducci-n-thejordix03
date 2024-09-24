import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {

        long factorial = 1 ;
        int num ;

        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un num");
        num = scan.nextInt();


        for(int i = 1; i<= num; i++){

            factorial *= i ;

        }
        System.out.println("el factorial de " + num + " es " + factorial);

    }
}

