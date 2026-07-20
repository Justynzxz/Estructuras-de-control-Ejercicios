/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mayor;
        int menor;
        int i;
        int ubiMayor;
        int ubiMenor;        
        int[] num = new int[15];
        
        System.out.print("Ingrese el numero 1: ");
        num[0] = sc.nextInt();
            
        mayor = num[0];
        menor = num[0];
        ubiMayor = 0;
        ubiMenor = 0;
        
        for (i = 1; i < num.length; i++) {
            System.out.print("Ingrese un numero " + (i+1) + ":");
            num[i] = sc.nextInt();
            
            if (num[i] > mayor) {
                mayor = num[i];
                ubiMayor = i;
            }

            if (num[i] < menor) {
                menor = num[i];
                ubiMenor = i;
            }
        }
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+ menor);
        System.out.println("La posicion del mayor es: "+ (ubiMayor + 1));
        System.out.println("La posicion del menor es: "+ (ubiMenor + 1));
    }
}