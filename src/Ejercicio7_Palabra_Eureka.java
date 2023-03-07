import java.util.Scanner;
public class Ejercicio7_Palabra_Eureka {
    
    //Crear un programa que pida una frase
    //y si esa frase es igual a “eureka” el programa
    //pondrá un mensaje de Correcto,
    //sino mostrará un mensaje de Incorrecto.
    //Nota: investigar la función equals() en Java.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingresa la contraseña: ");
        String frase = leer.nextLine();
        System.out.println("");
        
        com(frase);
    }
    public static void com(String frase){
        
        if (frase.equals("eureka") == true){
            System.out.println("Su contraseña es correcta");
        }else{
            System.out.println("Su contraseña es incorrecta");
        }
        System.out.println("");
    }
}
