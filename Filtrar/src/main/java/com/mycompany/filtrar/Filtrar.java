/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filtrar;

import java.util.Scanner;

/**
 *
 * @author t0cin
 */
public class Filtrar {

    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n"); 
        
        // Solicitud de datos
        System.out.print("Ingrese una frase: ");
        String frase = lea.next(); 
        
        System.out.print("Ingrese una cantidad: ");
        int cantidad = lea.nextInt();
        
        // Variables para procesar las palabras
        String palabra = "";
        System.out.println("Palabras con mayor longitud de " + cantidad + ":");

        // Contador para recorrer la frase
        int cont = 0;
        
        // Ciclo que recorre la frase
        while (cont < frase.length()) {
            char c = frase.charAt(cont); // Obtener el caracter actual

            // Si el caracter es un espacio significa que hemos encontrado una palabra
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
    }
}