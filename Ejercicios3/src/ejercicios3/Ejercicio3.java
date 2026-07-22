/**
 * @author Justyn Ricardo Chamba Jordan
 */
import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
public class Ejercicio3 {
    
    public static void saludar(String nombre){
    System.out.println("Bienvenido "+ nombre);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        saludar(nombre);
    }    
}