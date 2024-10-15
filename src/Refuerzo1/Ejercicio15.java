import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {

        int horas;
        int minutos = 0;
        int segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la segundos de semana: ");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
