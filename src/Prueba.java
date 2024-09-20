import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {

        int num;
        int positives = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            num = scan.nextInt();

            if (num > 0) {
                positives ++;
            }
        }
        System.out.println("positivos : " +positives);


    }
}

