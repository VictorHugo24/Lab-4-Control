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
        int opcion;
        int numcesar = 0;
        int cifradocesar, cifradocesarr;
        String frase = "";
        System.out.println("*** MENU ***");
        System.out.println("1. Cifrado");
        System.out.println("2. Filtrar");
        System.out.println("3. Codigo Enigma");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Favor ingresar una frase: ");
                frase = sc.nextLine();
                while (numcesar <= 0){
                System.out.println("Favor ingrese un numero positivo: ");
                numcesar = sc.nextInt();
                } 
                if (numcesar <= 0){
                    System.out.println("Favor ingrese un numero positivo");
                
            }
                for (int i = 0; i < frase.length(); i++) {
                    char caracter = frase.charAt(i);
                    if (caracter >= 'A' && caracter <= 'Z' || caracter >= 'a' && caracter <= 'z'){
                        cifradocesarr = (int)caracter;
                        cifradocesar = cifradocesarr + numcesar;
                        while (cifradocesar > (int)'Z'){
                            cifradocesar -= 26;
                        }
                        while (cifradocesar < (int) 'A'){
                            cifradocesar += 26;
                        }
                    
                }
                    
                }
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
        while (cont < frase.length()) {
            char c = frase.charAt(cont); // Obtener el carácter actual

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
        }
         default:
                System.out.println("Opcion no valida, intente de nuevo");
    }

           
            
        }
    }
    

