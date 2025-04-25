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
public class Rodriguez_Eric_Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio a | (3/2) + (4/3)
        double resultadoa = (3.0/2.0) + (4.0/3.0);
        
        System.out.println("a) (3/2) + (4/3) ="+resultadoa);
        //Ejercicio b | (1/x-5)-(3xy/4)
        System.out.println("Ejercicio b: (1/x-5)-(3xy/4)");
        System.out.println("Ingrese el valor de x");
        double xb = sc.nextDouble();
        System.out.println("Ingrese el valor de y");
        double yb = sc.nextDouble();
         double resultado_b = (1.0/(xb - 5.0)) - (3.0 * xb * yb) / (4.0);
        System.out.println("b) (1/(x-5)) - (3xy/4) = " + resultado_b);
        //Ejercicio c | (1/2) + 7
        double resultado_c = (1.0/2.0) - 7.0;
        System.out.println("c) (1/2) - 7 = 2"+resultado_c);
        //Ejercicio d | 7 + 1/2
        double resultado_d = 7 + (1/2);
        System.out.println("d) 7 + (1/2) = "+resultado_d);
        
        //Ejercicio e | (a^2/b-c) + (d-e)/(f)-(g*h)/(j)
        System.out.println("Ejercicio e:  (a^2/b-c) + (d-e)/(f)-(g*h)/(j)");
        System.out.println("Ingrese valor de a");
        double ae = sc.nextDouble();
        System.out.println("Ingrese valor de b");
        double be = sc.nextDouble();
        System.out.println("Ingrese valor de c");
        double ce = sc.nextDouble();
        System.out.println("Ingrese valor de d");
        double de = sc.nextDouble();
        System.out.println("Ingrese valor de e");
        double ee = sc.nextDouble();
        System.out.println("Ingrese valor de f");
        double fe = sc.nextDouble();
        System.out.println("Ingrese valor de g");
        double ge =sc.nextDouble();
        System.out.println("Ingrese valor de h");
        double he = sc.nextDouble();
        System.out.println("Ingrese valor de j");
        double je = sc.nextDouble();
        double resultado_e = (Math.pow(ae, 2) / (be - ce)) * ((de - ee) / (fe * ge * he / je));
        System.out.println(" e) ae ^2/be - ce) + (de - ee)/(fe)-(ge*he)/(je) = "+resultado_e);
        //Ejercicio f : m/n + p
        System.out.println("Ejercicio f : m/n + p");
        System.out.println("Ingrese valor de m");
        double mf = sc.nextDouble();
        System.out.println("Ingrese valor de n");
        double nf = sc.nextDouble();
        System.out.println("Ingrese valor de p");
        double pf = sc.nextDouble();
        double resultado_f = ( mf /nf + pf);
        System.out.println("El resultado es ="+resultado_f);
        //Ejercicio g : m + n/(p-q)
        System.out.println("Ejercicio g : m + n/(p-q)");
        System.out.println("Ingrese valor de m");
        double mg = sc.nextDouble();
        System.out.println("Ingrese valor de n");
        double ng = sc.nextDouble();
        System.out.println("Ingrese valor de p");
        double pg = sc.nextDouble();
        System.out.println("Ingrese valor de q");
        double qg = sc.nextDouble();
        System.out.println("El resultado es = ");
        double resultado_g = (mg + ng/(pg-qg));
        //Ejercicio h : 
        System.out.println("h) (a^2/b^2) + (c^2/d^2)");
        System.out.println("Ingrese valor de a");
        double ah = sc.nextDouble();
        System.out.println("Ingrese valor de b");
        double bh = sc.nextDouble();
        System.out.println("Ingrese valor de c");
        double ch = sc.nextDouble();
        System.out.println("Ingrese d");
        double dh = sc.nextDouble();
        double resultado_h = (Math.pow(ah, 3) * Math.pow(ch, 2)) / (Math.pow(bh, 2) + Math.pow(dh, 2));
        System.out.println("El resultado de la ecuacion es: "+resultado_h);
        //Ejercicio i
        System.out.println("i) (m + (n/p)) / (q - (r/s))");
        System.out.print("Ingrese el valor de m para la expresión i): ");
        double mi = sc.nextDouble();
        System.out.print("Ingrese el valor de n para la expresión i): ");
        double ni = sc.nextDouble();
        System.out.print("Ingrese el valor de p para la expresión i): ");
        double pi = sc.nextDouble();
        System.out.print("Ingrese el valor de q para la expresión i): ");
        double qi = sc.nextDouble();
        System.out.print("Ingrese el valor de r para la expresión i): ");
        double ri = sc.nextDouble();
        System.out.print("Ingrese el valor de s para la expresión i): ");
        double si = sc.nextDouble();
        double resultado_i = (mi + (ni / pi)) / (qi - (ri / si));
        System.out.println("i) (m + (n/p)) / (q - (r/s)) = " + resultado_i);
        //Ejercicio j
        System.out.println("j) (3a + b) / (c - ((d + 5e) / (f + (g / 2h)))");
          System.out.print("Ingrese el valor de a para la expresión j): ");
        double aj = sc.nextDouble();
        System.out.print("Ingrese el valor de b para la expresión j): ");
        double bj = sc.nextDouble();
        System.out.print("Ingrese el valor de c para la expresión j): ");
        double cj = sc.nextDouble();
        System.out.print("Ingrese el valor de d para la expresión j): ");
        double dj = sc.nextDouble();
        System.out.print("Ingrese el valor de e para la expresión j): ");
        double ej = sc.nextDouble();
        System.out.print("Ingrese el valor de f para la expresión j): ");
        double fj = sc.nextDouble();
        System.out.print("Ingrese el valor de g para la expresión j): ");
        double gj = sc.nextDouble();
        System.out.print("Ingrese el valor de h para la expresión j): ");
        double hj = sc.nextDouble();
        double resultado_j = (3 * aj + bj) / (cj - ((dj + 5 * ej) / (fj + (gj / (2 * hj)))));
        System.out.println("j) (3a + b) / (c - ((d + 5e) / (f + (g / 2h)))) = " + resultado_j);
        //Ejercicio k
        System.out.println("k) (a^2 + 2ab + b^2) / (1 - (x / (x^2 + 2)))");
        System.out.print("Ingrese el valor de a para la expresión k): ");
        double ak = sc.nextDouble();
        System.out.print("Ingrese el valor de b para la expresión k): ");
        double bk = sc.nextDouble();
        System.out.print("Ingrese el valor de x para la expresión k): ");
        double xk = sc.nextDouble();
        double resultado_k = (Math.pow(ak, 2) + 2 * ak * bk + Math.pow(bk, 2)) / (1 - (xk / (Math.pow(xk, 2) + 2)));
        System.out.println("k) (a^2 + 2ab + b^2) / (1 - (x / (x^2 + 2))) =" + resultado_k);

                }
}
