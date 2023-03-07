import java.util.Scanner;
public class Ejercicio5_Calculos_Con_Numeros {
    
    //Escribir un programa que lea un número entero
    //por teclado y muestre por pantalla el
    //doble, el triple y la raíz cuadrada de ese número.
    //Nota: investigar la función Math.sqrt().
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("");
        
        llen(num);
    }
    public static void llen (int num){
        
        int dob = num * 2;
        int tri = num * 3;
        double ra = Math.sqrt(num);
        
        System.out.printf("El doble de %d es: %d %nEl triple de %d es: %d %nLa raiz cuadrada de %d es: %f.%n",num,dob,num,tri,num,ra);
        System.out.println("");
    }
}
