import java.util.Scanner;
public class Ejercicio6 {

    public static int obtenerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("Número incorrecto. Intente nuevamente.");
            }

        } while (numero < 1 || numero > 100);

        return numero;
    }

    public static void main(String[] args) {
        int numeroRecibido = obtenerNumero();

        System.out.println("El número obtenido es: " + numeroRecibido);
    }
}