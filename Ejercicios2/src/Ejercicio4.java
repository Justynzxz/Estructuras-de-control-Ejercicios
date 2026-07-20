/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[20];
        int pares;
        int impares;
        int sumaPares;
        int sumaImpares;
        
        pares = 0;
        impares = 0;
        sumaPares = 0;
        sumaImpares = 0;
        

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares++;
                sumaPares = sumaPares + num[i];
            } else {
                impares++;
                sumaImpares = sumaImpares + num[i];
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);

        sc.close();
    }
}