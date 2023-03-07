import java.util.Scanner;
public class Ejercicio1_Suma_De_Dos_Numeros {
    
    //Escribir un programa que pida dos números enteros por teclado
    //y calcule la suma de los dos. El programa deberá
    //después mostrar el resultado de la suma.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        System.out.println("");
        
        sum(num1,num2);
    }
    
    public static void sum (int num1, int num2){
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("");
    }
}
