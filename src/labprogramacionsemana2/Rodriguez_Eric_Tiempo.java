/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionsemana2;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Tiempo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int segundos;
        System.out.println("Favor ingrese cantidad de segundos (numero entero)");
        segundos = sc.nextInt();
        String validacion = (segundos <= 0) ? "Numero invalido" : "";

        if (validacion.equals("Numero invalido")) {
            System.out.println(validacion);
        } else {
            System.out.println(segundos + " segundos equivalen a:");
            int horas = segundos / 3600;
            int minutos = (segundos % 3600) / 60;
            int segundosFinales = segundos % 60;
            System.out.println(horas + " horas, " + minutos + " minutos y " + segundosFinales + " segundos.");
        }
    }
    
}
