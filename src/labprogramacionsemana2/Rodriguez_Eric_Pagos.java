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
public class Rodriguez_Eric_Pagos {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);    
        System.out.println("Ingrese nombre del empleado: ");
        String nombre = sc.next(); 
        System.out.println("Ingrese el apellido del empleado");
        String apellido = sc.next();
        System.out.println("Ingrese codigo del empleado");
        int codigo = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas");
        int horastrabajadas = 0;
        horastrabajadas = sc.nextInt();
        double pagoporhora = 35.99;
        
        int horasregulares = 40;
        int horasextra;
        int hextr =0;
        int horasextrapagadas = 0;
        double salarioregular;
        System.out.println("Favor ingresar la categoria del empleado");
        System.out.println("Categoria 1 - $40 por hora ");
        System.out.println("Categoria 2 - $50 por hora");
        System.out.println("Categoria 3 - $85 por hora");
        System.out.println("Categoria 4 - $0 por hora");
        int categoria = sc.nextInt();
        
        if (horastrabajadas <= 40) {
            horasregulares = horastrabajadas;
            horasextra = 0;
        } else {
             
            horasextra = horastrabajadas - 40;
        }
        salarioregular = horasregulares * 35.99;
        switch (categoria){
            case 1:
                if(horasextra > 0){
                    if (horasextra <= 15){
                        horasextrapagadas =horasextra;
                    } else {
                        horasextrapagadas = 15;
                    }
                    hextr = horasextrapagadas * 40;
      
                }
                break;
            case 2:
                if(horasextra > 0){
                    horasextrapagadas = horasextra;
                    } else {
                        horasextrapagadas = 15;
                    }
                    hextr = horasextrapagadas * 50;
                    
                break;
                
            case 3:
                if (horasextra > 0){
                   if (horasextra <= 15){
                       horasextrapagadas = horasextra;
                       
                   } else {
                       horasextrapagadas = 15;
                   }
                   hextr = horasextrapagadas * 85;
                }
                break;
            case 4: 
                hextr = 0;
                break;
            default: 
                System.out.println("Categoria no disponible");
                    
                
                
        }
         double salariototal = salarioregular + hextr;
        System.out.println("\n*** Informacion del empleado:  ***");
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Horas Trabajadas: " + horastrabajadas);
        System.out.println("Categoria: " + categoria);
        System.out.println("*** Detalles de Pago ***");
        System.out.printf("Salario por Horas Normales : $%.2f\n", horasregulares, salarioregular);
        System.out.printf("Pago por Horas Extra : $%.2f\n", horasextrapagadas, horasextra, hextr);
        System.out.printf("Salario Total a Pagar: $%.2f\n", salariototal);
        
    }
}
