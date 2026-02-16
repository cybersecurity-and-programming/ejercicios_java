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
public class EjercicioDieciseis {
    //Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduce un numero entre 0 y 10");
            byte num = read.nextByte();
            if(num < 0){
                System.out.println("El numero introducido debe estar comprendido entre 0 y 10");
            }else{
                for(int i=0;i < 11;i++){
                    System.out.println(num+"*"+i+"="+(num*i));
                }
            }
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
