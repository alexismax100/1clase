import java.util.Scanner;
public class Ejercicio14_Convertidor_De_Dinero {
    
    //Crea una aplicación que a través de una función nos convierta
    //una cantidad de euros introducida por teclado a otra moneda,
    //estas pueden ser a dólares, yenes o libras.
    //La función tendrá como parámetros, la cantidad de euros
    //y la moneda a converir que será una cadena, 
    //este no devolverá ningún valor y mostrará un mensaje
    //indicando el cambio (void).
    //El cambio de divisas es:
    // * 0.86 libras es un 1 €
    // * 1.28611 $ es un 1 €
    // * 129.852 yenes es un 1 €
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double Con [] = new double [3];
        String nom [] = new String [3];
        
        System.out.print("Ingrese la cantidad de euros: ");
        int euro = leer.nextInt();
        
        double libras = euro * 0.86;
        double dolar = euro * 1.28611;
        double yenes = euro * 129.852;
        
        Con[0] = libras;
        Con[1] = dolar;
        Con[2] = yenes;
        nom[0] = "Libras";
        nom[1] = "Dolar";
        nom[2] = "Yenes";
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("El cambio a " + nom[i] + " es: " + Con[i]);
        }
        System.out.println("");
    }
}
