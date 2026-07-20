/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un numero " + (i+1) + ":");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
        System.out.println("Posicion " + (i+1) + ": "+ num[i]);
        }
    }
}