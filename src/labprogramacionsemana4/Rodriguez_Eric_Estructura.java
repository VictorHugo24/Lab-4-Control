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
            
        }
    }
    
}
