/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double suma; 
        double[] num = new double[10];
        double promedio;
        
        suma = 0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un numero " + (i+1) + ":");
            num[i] = sc.nextDouble();
            suma += num[i];
        }
        
        promedio = (double) suma / 10;
        
        System.out.println("Suma total: "+ suma);
        System.out.println("Promedio: "+ promedio);
    }
}