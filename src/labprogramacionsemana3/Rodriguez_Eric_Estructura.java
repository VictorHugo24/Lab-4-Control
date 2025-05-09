/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionsemana3;
import java.util.Scanner;
        
/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Estructura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;
        boolean esnumeroperfecto; 
        do{
            
            System.out.println("*******MENU*********");
            System.out.println("1. Palabras Alreves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.println("Favor ingrese su eleccion: ");
        
            opcion = sc.nextInt();
        
            switch (opcion){
                case 1:
                      System.out.print("Favor ingresar una palabra: ");
                    String palabra = sc.nextLine();
                    System.out.println("Su palabra al reves es: " + new StringBuilder(palabra).reverse().toString());
                    break;
                   
                case 2: 
                    System.out.println("Ingrese un numero: ");
                    int numeroperfecto = sc.nextInt();
                    if (esnumeroperfecto(numeroperfecto)){
                        
                    }
                    
                    
            }
            
        }while(opcion !=6);
    }
}
