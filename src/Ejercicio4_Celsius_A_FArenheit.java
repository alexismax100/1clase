import java.util.Scanner;
public class Ejercicio4_Celsius_A_FArenheit {
    
    //Dada una cantidad de grados centígrados
    //se debe mostrar su equivalente en grados
    //Fahrenheit.
    //La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el grado en Celsius: ");
        byte c = leer.nextByte();
        System.out.println("");
        
        celAfar(c);
    }
    
    public static void celAfar(byte c){
        
        int f = 32 + (9 * c / 5);
        
        System.out.printf("La convercion de Celsius a Farenheit es: %df.",f);
        System.out.println("");
        System.out.println("");
    }
}
