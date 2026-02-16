/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinUno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioTres {
    //Pedir el radio de una circunferencia y calcular su longitud.
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca el radio de la circunferencia");
            float radio = read.nextFloat();
            
            if(radio < 0){
                System.out.println("El radio de la circunferencia no puede ser menor que 0");
            }else{
                System.out.println("La longitud de la circunferencia es --> "+2*Math.PI*radio);
            }
        } catch (InputMismatchException e) {
            System.out.println("EL NUMERO DADO NO ES CORRECTO.");
        }
    }
}
