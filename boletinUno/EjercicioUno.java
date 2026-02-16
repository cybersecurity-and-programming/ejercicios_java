/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinUno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
        //ax2+bx+c=0
        try{
            Scanner lectura = new Scanner(System.in);
            System.out.println("Introduzca primer coeficiente");
            int a = lectura.nextInt();
            
            System.out.println("Introduzca primer coeficiente");
            int b = lectura.nextInt();
            
            System.out.println("Introduzca primer coeficiente");
            int c = lectura.nextInt();
            
            //se comprueba si la ecuacion tiene solucion a partir del discriminate = b2 - 4ac
            double discriminate = Math.pow(b, 2) - 4*a*c;
            if(discriminate >= 0){//La ecuacion tiene solucion
                System.out.println("PRIMERA SOLUCION ---> "+(-b+Math.sqrt(discriminate))/2);
                System.out.println("SEGUNDA SOLUCION ---> "+(-b-Math.sqrt(discriminate))/2);
            }else{
                System.out.println("La ecuacion no tiene solucion dentro de los numeros reales");
            }    
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}