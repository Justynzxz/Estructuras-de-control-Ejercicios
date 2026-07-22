/**
 * @author Justyn Ricardo Chamba Jordan
 */
public class Ejercicio2 {

    public static void mostrarPares() {
        System.out.println("Numeros pares del 2 al 100:");

        for (int numero = 2; numero <= 100; numero += 2) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        mostrarPares();
    }
}