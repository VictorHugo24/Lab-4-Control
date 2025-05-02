package labprogramacionsemana2;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Clases {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la fecha en formato DD/MM: ");
        String fechactual = sc.nextLine().toLowerCase();
        
        String[] partes = fechactual.split(", ");
        if (partes.length != 2) {
            System.out.println("No es el formato de fecha correcto.");
            return;
        }
        String diadelasemana = partes
    }
    
}
