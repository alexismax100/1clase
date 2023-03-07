import java.util.Scanner;
public class Ejercicio17_Vectores_Diguitos {
    
    //Recorrer un vector de N enteros
    //contabilizando cuántos números son 
    //de 1 dígito, cuántos de 2 dígitos,
    //etcétera (hasta 5 dígitos).
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        byte num = leer.nextByte();
        
        int tam [] = new int [num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("Ingresa el un numero: ");
            tam [i] = leer.nextInt();
        }
        
        int c1;
        c1 = 0;
        
        double cont = 0;
        for (int i = 0; i < num; i++) {
            do {
                cont = tam [i];
            cont = Math.floorDiv(tam[i],10);
            c1 = ++c1;
                System.out.println(c1);
            } while (cont < 1);
            
            if (c1 <= 1) {
                System.out.println("hay " + cont + "numeros con 1 digito.");
            }else if (cont == 2) {
                System.out.println("hay " + cont + "numeros con 2 digito.");
            }else if (cont == 3){
                System.out.println("hay " + cont + "numeros con 3 digito.");
            }else if (cont == 4){
                System.out.println("hay " + cont + "numeros con 4 digito.");
            }else if (cont == 4)
                System.out.println("hay " + cont + "numeros con 5 digito.");
        }
    }
}
