/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayor;
        int menor;
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        sc.close();
    }
}