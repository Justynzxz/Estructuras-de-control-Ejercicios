/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;
public class Ejercicio4 {
    
    public static void mostrarDatos(String nombre, int edad){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        
        if(edad > 18){
           System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();        
        
        mostrarDatos(nombre, edad);
    }
}