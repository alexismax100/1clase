import java.util.Scanner;
public class prueba {
    
    //definir num, contador Como Entero
    //Escribir "Ingrese un numero"
    //leer num
    //contador = 0
    //Mientras num >= 1 Hacer		
    //num = trunc(num / 10)
    //contador = contador + 1		
    //FinMientras	
    //Escribir "El numero tiene: ", contador, " Cifras"
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        int contador = 0;
        
        while (num >= 1){
            num = Math.floorDiv(num, 10);
            contador = ++contador;
        }
        System.out.println("El numero tiene: " + contador + " Cifras.");
    }
}
