/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio5 {

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: no se puede dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num;
        double num2;

        System.out.print("Ingrese el primer numero: ");
        num = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        operaciones(num, num2);
    }
}