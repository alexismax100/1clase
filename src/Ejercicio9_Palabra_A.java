import java.util.Scanner;
public class Ejercicio9_Palabra_A {
    
    //Escriba un programa que pida una frase
    //o palabra y valide si la primera letra
    //de esa frase es una ‘A’. 
    //Si la primera letra es una ‘A’,
    //se deberá de imprimir un mensaje
    //por pantalla que diga “CORRECTO”,
    //en caso contrario, se deberá
    //imprimir “INCORRECTO”. Nota: investigar
    //la función Substring y equals() de Java.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra que empeize por A: ");
        String palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        System.out.println("");
        
        
        llen(palabra);
    }
    
    public static void llen (String palabra){
        
        char letra = palabra.charAt(0);
        
        if (letra == 'a') {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        System.out.println("");
    }
}
