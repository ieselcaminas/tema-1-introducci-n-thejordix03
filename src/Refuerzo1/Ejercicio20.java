package Refuerzo1;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {

        int casos = 1;
        int hojas = 1;
        boolean imposible ;
        int hojasRestantes;
        int trebolesCuatro;

        Scanner scanner = new Scanner(System.in);
        System.out.println("hojas");
        hojas = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            imposible = true;

            for (trebolesCuatro = hojas / 4; trebolesCuatro >= 0; trebolesCuatro--) {
              hojasRestantes = hojas - (trebolesCuatro * 4);

                if (hojasRestantes % 3 == 0) {
                    System.out.println(trebolesCuatro);
                    imposible = false;
                    break;
                }
            }
            if (imposible) {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}
