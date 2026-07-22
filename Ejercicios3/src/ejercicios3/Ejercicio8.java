/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio8 {
    
    public static double calcularArea(double base, double altura){
    double area = base * altura;
     return area;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base;
        double altura;
        double resultado;
        
        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();
        
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();
        
        resultado = calcularArea(base, altura);        
        
        System.out.println("El area es: " + resultado);
    }
}