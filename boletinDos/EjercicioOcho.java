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
public class EjercicioOcho {
    //Pedir un número N, y mostrar todos los números del 1 al N.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduzca u numero del 1 a N");
            int num = read.nextInt();
            
            if(num < 1){
                System.out.println("El numero introducido no puede ser menor que N");
            }else{
                for (int i = 1; i <= num; i++) {
                    System.out.print(i+" ");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
