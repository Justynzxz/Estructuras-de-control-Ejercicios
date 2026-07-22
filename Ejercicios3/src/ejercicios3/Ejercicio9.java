/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio9 {

    public static double calcularPromedio(
            double n1, double n2, double n3
    ) {
        double promedio;
        promedio = (n1 + n2 + n3) / 3;
        return promedio;
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();

        double promedio = calcularPromedio(nota1, nota2, nota3);

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante no aprobó.");
        }
    }
}