package Introducción;
// 16 Realiza un programa que lea dos números enteros y dependiendo de la operación que indique el usuario (+, -, * , /) muestre el resultado (M)
import java.util.Scanner;
public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        String operacion;
        boolean operacionvalida = true;
        int resultado = 0;

        System.out.println("Introduce un num entero");
        num1 = sc.nextInt();
        System.out.println("Introduce un operacion");
        operacion = sc.next();
        System.out.println("Introduce un num entero");
        num2 = sc.nextInt();

        switch(operacion) {

            case "+":
                resultado = num1 + num2;
                break;
                case "-":
                    resultado = num1 - num2;
                    break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                        case "/":
                            if(num1 != 0) {
                                resultado = num1 / num2;
                            }else{
                                System.out.println("El resultado no es valido");
                            }
        }
        if(operacionvalida) {
            System.out.println("El resultado de  "+num1 +"  "+ operacion +"  "+ num2 +" es: " + resultado);
        }












    }
}
