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
        //Trim: elimina los espacios en blanco
        String diadelasemana = partes[0].trim().toLowerCase();
        String [] diames = partes[1].split("/");
        
        if(diames.length != 2){
            System.out.println("Formato incorrecto, intende de nuevo");
            return;
        }
        
        int dia =Integer.parseInt(diames[0]);
        int mes=Integer.parseInt(diames[1]);
    if ( dia < 1 || dia > 31 || mes < 1 || mes > 12){
            System.out.println("Fecha invalida, intente de nuevo");
            return;
    }
    
    if (diadelasemana.equals("lunes")){
        System.out.println("Lunes, hubo examen?");
        System.out.println("1. Si");
        System.out.println("2. No");
        String respuestaexamen = sc.nextLine().toLowerCase();
        if (respuestaexamen.equals("1")){
            System.out.println("Ingrese los alumnos aprobados");
            int aprobados =sc.nextInt();
            System.out.println("Ingrese alumnos desaprobados");
            int desaprobados = sc.nextInt();
            if (aprobados + desaprobados > 0){
                double porcentaje = (double) aprobados / (aprobados + desaprobados)* 100;
                 System.out.println("Alumnos aprobados: " + porcentaje + "%");
                } else {
                    System.out.println("Sin alumnos disponibles");
                }
                
            }
        }else if (diadelasemana.equals("Martes")){
            System.out.println("Martes, Hubo examen?");
            System.out.println("1. Si");
            System.out.println("2. No");
             String respuestaexamen = sc.next().toLowerCase();
            if (respuestaexamen.equals("1")) {
                System.out.println("Ingrese los alumnos aprobados");
                int aprobaron = sc.nextInt();
                System.out.println("Ingrese los alumnos desaprobados");
                int desaprobados = sc.nextInt();
                if (aprobaron + desaprobados > 0) {
                    double porcentaje = (double) aprobaron / (aprobaron + desaprobados) * 100;
                    System.out.println("Alumnos Aprobados: " + porcentaje + "%");
                } else {
                    System.out.println("Sin alumnos disponibles");
                }
            }
        } else if (diadelasemana.equals("Miercoles") || diadelasemana.equals("miercoles")) {
            System.out.println("Miercoles. ¿Hubo examen?");
            System.out.println("1. Si");
            System.out.println("2. No");
            String respuestaexamen = sc.next().toLowerCase();
            if (respuestaexamen.equals("1")) {
                System.out.println("Ingrese alumnos aprobados: ");
                int aprobaron = sc.nextInt();
                System.out.println("Ingresos alumnos desaprobados: ");
                int noAprobaron = sc.nextInt();
                if (aprobaron + noAprobaron > 0) {
                    double porcentaje = (double) aprobaron / (aprobaron + noAprobaron) * 100;
                    System.out.println("Alumnos aprobados: " + porcentaje + "%");
                } else {
                    System.out.println("Sin alumnos disponibles");
                }
            }
        } else if (diadelasemana.equals("jueves")) {
            System.out.println("Jueves. ¿Cuantos asistieron al examen?");
            double porcentajeAsistencia = sc.nextDouble();
            if (porcentajeAsistencia > 50) {
                System.out.println("Asistio la mayoria");
            } else {
                System.out.println("No asistio la mayoria.");
            }
        } else if (diadelasemana.equals("viernes")) {
            System.out.println("Hoy es viernes.");
            if ((dia == 1 && mes == 1) || (dia == 1 && mes == 7)) {
                 
                System.out.println("¿Cuantos alumnos hay en el nuevo ciclo?");
                int cantidadalumnos = sc.nextInt();
                System.out.println("¿Cuanto paga cada alumno?");
                double precioalumno = sc.nextDouble();
                double totalingresos = cantidadalumnos * precioalumno;
                System.out.println("El ingreso total es de: $" + totalingresos);
            }
        } else {
            System.out.println("Ese dia no es valido");
        }
    }
        
        
    }
    

