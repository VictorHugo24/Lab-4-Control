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
        int numero;
        boolean primo = true; 
        int numperfecto = 0;
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
                    System.out.println("Favor ingresar un numero: ");
                    numero = sc.nextInt();
                    if (numero <= 1){
                        System.out.println("Numero no valido, intente de nuevo ");
                    } else {
                        for (int i = 1; i < numero; i++) {
                            if (numero % i == 0){
                                numperfecto += i;
                                
                            
                        }
                    }
                        if (numperfecto == numero) {
                            System.out.println("Su numero es perfecto");
                        } else {
                            System.out.println("Su numero no es perfecto");
                        } 
                    }
                    
              case 3: 
                    System.out.println("Ingrese un numero: ");
                    int num = sc.nextInt();
                    if (num <= 1){
                        System.out.println("No es numero primo");
                        
                    } else {
                        for (int i = 2; i < num; i++) {
                            if(num % i == 0){
                                primo = false;
                                break;
                                
                            }
                            
                        }
                        if (primo) {
                            System.out.println("Su numero es primo");
                            
                        } else{
                            System.out.println("Su numero no es primo");
                        }
                    }
              case 4: 
                  int votantes; 
                  System.out.println("Ingrese la cantidad de votantes");
                  votantes = sc.nextInt();
                  System.out.println("Ingrese los votos por partido");
                    
                    
            }
            
        }while(opcion !=6);
    }
}
