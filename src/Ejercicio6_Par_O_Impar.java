import java.util.Scanner;
public class Ejercicio6_Par_O_Impar {
    
    //Crear un programa que dado un numero
    //determine si es par o impar.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        byte num = leer.nextByte();
        System.out.println("");
        
        parOimpar (num);
    }
    
    public static void parOimpar(byte num){
        
        if (num % 2 == 0){
            System.out.println("Su numero es Par");
        }else{
            System.out.println("Su numero es Impar");
        }
        System.out.println("");
    }
}
