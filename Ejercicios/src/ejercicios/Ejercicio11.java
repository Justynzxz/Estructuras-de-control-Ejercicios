package ejercicios;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int i;
        int mayor;
        int menor;              
        
        System.out.print("Ingrese el número 1:");
        num = sc.nextInt();
            
        mayor = num;
        menor = num;
        for (i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextInt();
            
            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }    
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}