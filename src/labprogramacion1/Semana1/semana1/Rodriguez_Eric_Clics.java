/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion1.Semana1.semana1;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Clics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Favor poner la cantidad de clics de 0.25%");
        int clics1 = sc.nextInt();

        System.out.println("Favor poner la cantidad de clics de 0.30%");
        int clics2 = sc.nextInt();

        System.out.println("Favor poner la cantidad de clics de 0.80%");
        int clics3 = sc.nextInt();

        double costo1 = clics1 * 0.25;
        double costo2 = clics2 * 0.30;
        double costo3 = clics3 * 0.80;
        double costot = costo1 + costo2 + costo3;
        double tclics = clics1 + clics2 + clics3;
        double isv = costot * 0.16;
        double totalConISV = costot + isv;

        System.out.println("Su total sera de: $" + costot + " y el total con ISV $" + totalConISV);

        
    }

     
}
