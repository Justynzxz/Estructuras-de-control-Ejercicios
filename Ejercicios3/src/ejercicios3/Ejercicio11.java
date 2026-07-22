/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio11 {

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num; 
        System.out.print("Ingrese un numero: ");
        num = entrada.nextInt();

        boolean resultado = esPar(num);

        if (resultado == true) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}