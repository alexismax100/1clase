import java.util.Scanner;
public class Ejercicio3_Frase_En_Mayusculas_Y_Minusculas {
    
    //Escribir un programa que pida una frase
    //y la muestre toda en mayúsculas y después toda en minúsculas.
    //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = leer.nextLine();
        
        mym(frase);
     }
    
    public static void mym (String frase){
        
        System.out.println("");
        System.out.println("La frase en Mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase en Minuscula es: " + frase.toLowerCase());
        System.out.println("");
    }
 }
