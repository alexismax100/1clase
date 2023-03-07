import java.util.Scanner;
public class Ejercicio8_Longitud_palabra {
    
    //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    //usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    //Nota: investigar la función Lenght() en Java.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra de 8 caracteres: ");
        String palabra = leer.nextLine();
        System.out.println("");
        
        lon(palabra);
    }
    
    public static void lon(String palabra){
        
        if (palabra.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        System.out.println("");
    }
}
