/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio10 {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros son iguales.");
        } else {
            resultado = mayor(num1, num2);
            System.out.println("El numero mayor es: " + resultado);
        }
    }
}