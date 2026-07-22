/**
 * @author Justyn Ricardo Chamba Jordan
 */
public class Ejercicio6 {

    public static int obtenerNumero() {
        int numero;
        numero = (int) (Math.random() * 100) + 1;
        return numero;
    }

    public static void main(String[] args) {
        int numeroRecibido;

        numeroRecibido = obtenerNumero();

        System.out.println("El numero aleatorio obtenido es: "
                + numeroRecibido);
    }
}