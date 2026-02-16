/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinUno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioDos {
    public static void main(String[] args) {
        //Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        try{
            Scanner data = new Scanner(System.in);
            
            System.out.println("Introduzca radio");
            float radio = data.nextFloat();
            
            if(radio < 0){
                System.out.println("El radio debe ser mayor que 0");
            }else{
                System.out.println("El area del circulo pedido es --> "+Math.PI * Math.pow(radio, 2));
            }
        }catch(InputMismatchException e){
            System.out.println("EL NUMERO DADO NO ES CORRECTO. INTRODUZCA UN NUMERO DECIMAL. POR EJEMPLO: 2,5-5-10-15,5");
        }
    }
}
