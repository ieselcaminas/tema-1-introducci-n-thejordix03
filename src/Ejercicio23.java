import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {

        int numero1 = 0;
        int positives = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros");

        for (int i = 0; i < 5; i++) {
            numero1 = scan.nextInt();

            if (numero1 > 0) {
                positives++;
            }
        }
        System.out.println("positivos : " + positives);

        if (numero1 == 0) {
            scan.close();
        }
    }
}
