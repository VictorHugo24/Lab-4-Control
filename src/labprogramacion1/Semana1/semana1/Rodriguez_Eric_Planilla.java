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
public class Rodriguez_Eric_Planilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         sc.useDelimiter("\n");
        String  Nombre;
        int Horasmensuales; 
        double Tarifaporhora;
        
         System.out.print("Favor ingresar nombre: ");
         Nombre = sc.next(); 
         
         System.out.print("Favor ingresar las horas mensuales: ");
         Horasmensuales = sc.nextInt();
         
         System.out.print("Favor ingresar Tarifa por hora: ");
         Tarifaporhora = sc.nextDouble();
         
         double salariosemanal = (Horasmensuales * Tarifaporhora);
         System.out.println("----- Boleta del Empleado -------");
         System.out.println("Nombre Del Empleado: "+Nombre+" \nHora de Trabajo mensual:" +Horasmensuales+"\nTarifa Por Hora: " +Tarifaporhora+ " \nSalario del Empleado Semanal:"+
        "Lps."+salariosemanal);
    }
    
}
