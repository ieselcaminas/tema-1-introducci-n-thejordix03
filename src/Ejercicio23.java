import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {

        int numero1;
        int positives = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros");

        for (int i = 0; i < 5; i++) {
            numero1 = scan.nextInt();

            if (numero1 > 0) {
                positives++;
            }
            else {
                System.out.println("FIN");
            }
        }
        System.out.println("positivos : " + positives);


    }
}
