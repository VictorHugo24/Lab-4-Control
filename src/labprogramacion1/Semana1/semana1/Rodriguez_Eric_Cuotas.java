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
public class Rodriguez_Eric_Cuotas {
     public static void main(String[] args) {
        
    
 {
        
    }{
        Scanner sc =new Scanner (System.in);
    double prestamo,interesm,comisioncuota,porcentajedelseguro,cuotamensual,totalapagar;
         int plazomeses;
         System.out.println("Favor ingresar monto del prestamo");
         prestamo = sc.nextDouble();
         System.out.println("Favor ingrese el plazo del prestamo(en meses)");
         plazomeses = sc.nextInt();
         System.out.println("Favor ingrese el interes mensual");
         interesm = sc.nextDouble();
         System.out.println("Ingrese la comision por cuota en Lempiras");
         comisioncuota = sc.nextDouble();
         System.out.println("Ingrese el porcentaje en seguro mensual");
         porcentajedelseguro = sc.nextDouble();
         double interesMensualCalculado = prestamo * interesm;
        double seguroMensualCalculado = prestamo * porcentajedelseguro;
        double capitalMensual = prestamo / plazomeses;
        double cuotaMensual = capitalMensual + interesMensualCalculado + seguroMensualCalculado + comisioncuota;

        
        double totalAPagar = cuotaMensual * plazomeses;

        System.out.println("\n******** CUOTAS MENSUALES ********");
        System.out.println("Cuota de Pago Mensual: HNL "+cuotaMensual);
        System.out.println("Total a Pagar: HNL "+totalAPagar);
}
     }
}
       
    
