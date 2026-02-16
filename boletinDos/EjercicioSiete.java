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
public class EjercicioSiete {
    //Pedir números hasta que se introduzca uno negativo, y calcular la media.
     public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num = 0;
            int suma = 0;
            
            int num_elementos = 1;
            System.out.println("Introduzca un numero");
            while((num = read.nextInt()) != 0){
                suma += num;
                num_elementos++;
                System.out.println("Introduzca un numero");
            }
            System.out.println("La media es: "+suma/num_elementos);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
