/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma; 
        
        suma = 0;
        
        for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("Ingrese el valor de la posicion ["+ i + "][" + j + "]: ");
            matriz[i][j] = sc.nextInt();
          }
        }
        
        for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
           System.out.print(matriz[i][j] +" ");
          }
        System.out.println();
        }
        
        System.out.print("Elementos de la diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            suma += matriz[i][i];
        }

        System.out.println("y la suma de la diagonal principal es: " + suma);

        sc.close();
    }
}  