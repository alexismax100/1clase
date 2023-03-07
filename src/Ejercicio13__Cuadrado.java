import java.util.Scanner;
public class Ejercicio13__Cuadrado {
    
    //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
    //dibujar lo siguiente:
    //
    //   * * * *
    //   *     *
    //   *     *
    //   * * * *
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el tamaño del cuadrado: ");
        byte num = leer.nextByte();
        
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        
        System.out.println("");
        
        for (int i = 0; i < num-2; i++) {
            System.out.print("* ");
            for (int j = 0; j < num-1; j++) {
                if(j == num-2){
                    System.out.println("*");
                }else{
                    System.out.print("  ");
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
