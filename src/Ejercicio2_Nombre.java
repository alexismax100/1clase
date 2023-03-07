import java.util.Scanner;
public class Ejercicio2_Nombre {
    
    //Escribir un programa que pida tu nombre,
    //lo guarde en una variable y lo muestre por
    //pantalla.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        imprimir (nombre);
     }
    
    public static void imprimir (String nombre){
        
        System.out.println("Tu nombre es: " + nombre);
    }
 }
