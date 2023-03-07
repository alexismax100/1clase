import java.util.Scanner;
public class Ejercicio12r {
    
    //Realizar un programa que simule
    //el funcionamiento de un dispositivo RS232,
    //este tipo de dispositivo lee cadenas
    //enviadas por el usuario.
    //Las cadenas deben llegar con un formato
    //fijo: tienen que ser de un máximo
    //de 5 caracteres de largo, 
    //el primer carácter tiene que ser
    //X y el último tiene que ser una O.
    //Las secuencias leídas que respeten 
    //el formato se consideran correctas,
    //la secuencia especial “&&&&&” marca
    //el final de los envíos (llamémosla FDE),
    //y toda secuencia distinta de FDE,
    //que no respete el formato se considera
    //incorrecta. Al finalizar el proceso, 
    //se imprime un informe indicando la
    //cantidad de lecturas correctas e
    //incorrectas recibidas. Para resolver 
    //el ejercicio deberá investigar cómo 
    //se utilizan las siguientes funciones 
    //de Java Substring(), Length(), equals().
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        byte correcto = 0;
        byte incorrecto = 0;
        byte max = 5; 

        System.out.println("Ingrese una palabra de 5 caracteres que empiese por la X y termine con la O: ");
        String palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        
        while(!palabra.equals("&&&&&")){
            if (palabra.substring(0,1).equals("x") && palabra.substring(palabra.length()-1).equals("o") && max == palabra.length()){
                ++correcto;
            }else{
                ++incorrecto;
            }
            System.out.print("Ingrese otra palabra: ");
            palabra = leer.nextLine();
            palabra = palabra.toLowerCase();
            
            if(palabra.equals("&&&&&")){
                break;
            }
        }
        
        System.out.printf("%nLa cantidad de palabras correctas ingresadas son : %d %nLa cantidad de palabras incorrectas realizadas son : %d %n %n", correcto, incorrecto);
    }
 
}
