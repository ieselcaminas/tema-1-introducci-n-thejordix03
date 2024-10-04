import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {

        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la hora de semana: ");
        horas = sc.nextInt();
        System.out.println("Ingrese la minutos de semana: ");
        minutos = sc.nextInt();
        System.out.println("Ingrese la segundos de semana: ");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = minutos / 60;
        segundos = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
