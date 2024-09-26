import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        int num;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("introduce un numero : ");
        num = scan.nextInt();

        System.out.println("introduce otro numero : ");
        num2 = scan.nextInt();

        do {
            num = num - num2;
        } while (num >= num2);

        System.out.println("El resultado es : " + num );

    }
}




