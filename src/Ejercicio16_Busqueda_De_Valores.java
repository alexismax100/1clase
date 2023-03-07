import java.util.Scanner;
public class Ejercicio16_Busqueda_De_Valores {
    
    //Realizar un algoritmo que rellene un vector de tamaño N con valores
    //aleatorios y le pida al usuario un numero a buscar en el vector.
    //El programa mostrará donde se encuentra el
    //numero y si se encuentra repetido
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        
        int numRandom []= new int [num];
        
        for (int i = 0; i < num; i++) {
            numRandom [i] = (int) (Math.random() * 100 + 1);
            System.out.print(numRandom [i] + ", ");
        }
        System.out.println("");
        System.out.println("que numero quiere buscar?");
        int num2 = leer.nextInt();
        System.out.println("");
        
        int c = 0;
        byte c2= 0;
        for (int i = 0; i < num; i++) {
            if (numRandom[i] == num2){
                c = i+1;
                System.out.println("El numero se encuentra en el vector: " + c);
                c2 = ++ c2;
            }
        }
        System.out.println("");
        if (c2 > 1) {
            System.out.println("El numero se repite: " + c2 + " veces.");
        }else{
            System.out.println("No se a encontrado el numero");
        }
        System.out.println("");
    }
}