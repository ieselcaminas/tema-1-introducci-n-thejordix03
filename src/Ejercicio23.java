import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {

        int numero1;
        int positives = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese n numeros");

        do {
            numero1 = scan.nextInt();
            if (numero1 > 0) {
                positives = positives + 1;
            }
        }
        while (numero1 != 0);

        System.out.println("positivos : " + positives);
    }
}
