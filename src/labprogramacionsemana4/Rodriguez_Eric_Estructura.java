/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionsemana4;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Estructura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String fraseog ;
        int desplazamiento;
        sc.useDelimiter("\n");
        int opcion = 0;
        while (opcion != 4){
        System.out.println("*** MENU ***");
        System.out.println("1. Cifrado");
        System.out.println("2. Filtrar");
        System.out.println("3. Codigo Enigma");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                //Codigo cesar
                 System.out.println("Ingrese la frase a cifrar:");
        fraseog = sc.next();
        
                System.out.println("Ingrese el numero de posiciones a desplazar:");
         desplazamiento = sc.nextInt();
        
        String fraseCifrada = "";
        int longitud = fraseog.length();
        int i = 0;

        while (i < longitud) {
            char caracterog = fraseog.charAt(i);
            char caracterCifrado;

            if (caracterog >= 'a' && caracterog <= 'z') {
                int posicionog = caracterog - 'a';
                int posicioncr = (posicionog + desplazamiento) % 26;
                caracterCifrado = (char) ('a' + posicioncr);
            } else if (caracterog >= 'A' && caracterog <= 'Z') {
                int posicionOriginal = caracterog - 'A';
                int posicioncr = (posicionOriginal + desplazamiento) % 26;
                caracterCifrado = (char) ('A' + posicioncr);
            } else {
                caracterCifrado = caracterog;
            }

            fraseCifrada = fraseCifrada + caracterCifrado;
            i = i + 1;
        }

        System.out.println("Su frase cifrada es: " + fraseCifrada);
         
    
                break;
                //Filtrar
            case 2:
                sc.useDelimiter("\n"); 
        
        // Solicitud de datos
        System.out.print("Ingrese una frase: ");
        String frase2 = sc.next(); 
        
        System.out.print("Ingrese una cantidad: ");
        int cantidad = sc.nextInt();
        
        // Variables para procesar las palabras
        String palabra = "";
        System.out.println("Palabras con mayor longitud de " + cantidad + ":");

        // Inicializar el contador para recorrer la frase
        int cont = 0;
        
        // Ciclo que recorre la frase
        while (cont < frase2.length()) {
            char c = frase2.charAt(cont); // Obtener el carácter actual

            // Si el caracter es un espacio, significa que hemos encontrado una palabra
            if (c == ' ') {
                if (palabra.length() >= cantidad) {  // Mayor o igual longitud
                    System.out.println(palabra); // Imprimir palabra si cumple con la longitud
                }
                palabra = ""; // Limpiar la variable para la siguiente palabra
            } else {
                palabra += c; // Concatenamos
            }

            cont++;  // Incrementar el contador para continuar con el siguiente caracter
        }

        // Verificamos la ultima palabra (despues del ultimo espacio)
        if (palabra.length() >= cantidad) {  // Mayor o igual longitud para la ultima palabra
            System.out.println(palabra); // Imprimir la última palabra si cumple con la longitud
        } break;
         default:
                System.out.println("Opcion no valida, intente de nuevo");
                break;
    }

           
        
        }  
    }
}
    

