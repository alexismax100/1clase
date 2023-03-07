import java.util.Scanner;
public class Ejercicio10_Suma_Hasta_Limite {
    
    //Escriba un programa en el cual
    //se ingrese un valor límite positivo,
    //y a continuación solicite números
    //al usuario hasta que la suma de los
    //números introducidos supere el límite
    //inicial. 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un valor limie positivo: ");
        int lim = leer.nextInt();
        System.out.println("");
        
        System.out.print("Inrese un numero: ");
        int num =leer.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        
        suma (num,num2,lim);
    }
    public static void suma(int num, int num2, int lim){
    Scanner leer = new Scanner (System.in);
    
        int suma = num + num2;
        
        while (suma < lim){
            System.out.print("Ingrese otro numero: ");
            num2 = leer.nextInt();
            num = suma;
            suma = num + num2;
        }
        System.out.println("");
        System.out.println("la suma de los numeros alcanso el limite.");
        System.out.println("");
    }
}
