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
public class EjercicioDoce {
    //Pedir un número y calcular su factorial.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int resultado = 1;
            System.out.println("Introduzca un numero del 1 a N");
            int num = read.nextInt();
            
            for(int i = num;i > 0;i--){
                resultado = resultado * i;
            }
            System.out.println("El factorial de "+num+" es: "+resultado);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
