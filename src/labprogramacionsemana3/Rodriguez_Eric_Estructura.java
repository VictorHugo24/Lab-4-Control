/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionsemana3;
import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Estructura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        int opcion;
        int numero;
        boolean primo = true; 
        int numperfecto = 0;
        String palabralarga = "";
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
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
                    contador1++;
                    System.out.println("Ingrese la cantidad de palabras que va a ingresar");
                    int cantidadpalabras = sc.nextInt(); 
                    for (int i = 0; i <= cantidadpalabras; i++) {
                    System.out.print("Ingrese la palabra : ");
                    String palabra = sc.nextLine();
                     
        
                    System.out.println("Su palabra al reves es: " + new StringBuilder(palabra).reverse().toString());
                    
                    
                     if (palabra.length() > palabralarga.length()) {
                palabralarga = palabra;
                        System.out.println("Su palabra mas larga es: "+palabralarga);
            }       
                    }
                    break;
                case 2:
                    contador2++;
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
                    contador3++;
                    int numrandom = random.nextInt(100) +1;
                    int cd =0;
                    String lista = "";
                    if (numrandom <= 1){
                       primo = false;
                    } else {
                        for (int i = 2; i < numrandom; i++) {
                            if(numrandom % i == 0){
                                cd++;
                                
                                if( i < numrandom){
                                lista += ", ";    
                                }
                                 if (i > 1 && i < numrandom) {
                        primo = false;
                                primo = false;
                                break;
                                
                            }
                            
                        }
                        if (primo && numrandom > 1) {
            System.out.println("Su numero es primo");
        } else {
            System.out.println("Su numero no es primo");
        }
             case 4: 
             contador4++;
                  int votantes;
                    System.out.print("Ingrese la cantidad de votantes: ");
                    votantes = sc.nextInt();
                    int votosazules = 0, votosrojos = 0, votosnegros = 0, votosamarillos = 0, votosnulos = 0;

                    for (int i = 0; i < votantes; i++) {
                        System.out.print("Ingrese el voto (" + (i + 1) + " de " + votantes + "): ");
                        System.out.println("\n1. Azul\n2. Rojo\n3. Negro\n4. Amarillo ");
                        int voto = sc.nextInt();
                        switch (voto) {
                            case 1:
                                votosazules++;
                                break;
                            case 2:
                                votosrojos++;
                                break;
                            case 3:
                                votosnegros++;
                                break;
                            case 4:
                                votosamarillos++;
                                break;
                            default:
                                votosnulos++;
                                break;
                        }
                    }

                    int votosvalidos = votosazules + votosrojos + votosnegros + votosamarillos;
                    if (votosvalidos >= votantes * 0.60) {
                        if (votosazules > votosrojos && votosazules > votosnegros && votosazules > votosamarillos) {
                            System.out.println("La planilla ganadora es azul");
                        } else if (votosrojos > votosazules && votosrojos > votosnegros && votosrojos > votosamarillos) {
                            System.out.println("La planilla ganadora es rojo");
                        } else if (votosnegros > votosazules && votosnegros > votosrojos && votosnegros > votosamarillos) {
                            System.out.println("La planilla ganadora es negro");
                        } else {
                            System.out.println("La planilla ganadora es amarillo");
                        }
                    } else {
                        System.out.println("Votacion Fallida");
                    }
              case 5:
              System.out.println("******Resumen de la Ejecucion*******");
              System.out.println("1. Palabras al reves: "+contador1+" veces");
              System.out.println("2. Numero Perfecto : "+contador2+ " veces");
              System.out.println("3. Primos : "+contador3+" veces");
              System.out.println("4. Votaciones: "+contador4+ " veces");
              sc.close();
              break;
              default:
                  System.out.println("Opcion no valida, intente de nuevo ");
                  break;
            }
            
                    }while(opcion !=6);
            }
}
