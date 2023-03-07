import java.util.Scanner;
public class Ejercicio11_Calculadora {
    
    //Realizar un programa que pida
    //dos números enteros positivos 
    //por teclado y muestre por
    //pantalla el siguiente menú:
    //MENU
    //1. Sumar
    //2. Restar
    //3. Multiplicar
    //4. Dividir
    //5. Salir
    //Elija opción:
    //El usuario deberá elegir una opción
    //y el programa deberá mostrar el resultado
    //por pantalla y luego volver al menú.
    //El programa deberá ejecutarse hasta
    //que se elija la opción 5.
    //Tener en cuenta que, si el usuario
    //selecciona la opción 5, en vez de salir
    //del programa directamente,
    //se debe mostrar el siguiente mensaje
    //de confirmación:
    //¿Está seguro que desea salir del programa
    //(S/N)? Si el usuario selecciona 
    //el carácter ‘S’ se sale del programa,
    //caso contrario se vuelve a mostrar el menú.
    
    public static void espacio(){
        System.out.printf("%n %n %n %n %n %n %n %n %n %n %n %n");
        }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        System.out.println("");
        
        menu(num,num2); 
        
    }
    public static void menu (int num, int num2){
        Scanner leer = new Scanner (System.in);
        byte opcion;
        char salir = 0;
        espacio();
        
        do{
            do {
                System.out.println("");
                System.out.println("MENU");
                System.out.println("");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multliplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                
                opcion = leer.nextByte();
                
            } while(opcion > 5);
            
            switch (opcion) {
                case 1:
                    espacio();
                    int suma = num + num2;
                    System.out.println("La suma de los numeros es: " + suma);
                    break;
                case 2:
                    espacio();
                    int resta = num - num2;
                    System.out.println("La resta de los numeros es: " + resta);
                    break;
                case 3:
                    espacio();
                    int mult = num * num2;
                    System.out.println("La multiplicasion de los numeros es: " + mult);
                    break;
                case 4:
                    espacio();
                    double div = num / num2;
                    System.out.println("La division de los numeros es: " + div);
                    break;
            }
            
            if (opcion == 5){
                System.out.println("Esta seguro que desea salir del programa (S/N)?");
                    salir = leer.next().charAt(0);
                    salir = Character.toLowerCase(salir);
            }
            
        }while (salir != 's'); 
        
        espacio();
        System.out.println("");
    }        
}
