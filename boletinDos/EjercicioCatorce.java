/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinDos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioCatorce {
    //Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int sueldo_mil = 0;
            int resultado = 0;
            int sueldo = 0;
            for(int i = 0;i < 10;i++){
                System.out.println("Introduzca un sueldo");
                sueldo = read.nextInt();
                
                if(sueldo > 1000){
                    sueldo_mil++;
                }
                resultado = resultado + sueldo;
            }
            System.out.println("La suma de los sueldos es: "+resultado+".\nY el numero de sueldos mayores que 1000 es: "+sueldo_mil);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
