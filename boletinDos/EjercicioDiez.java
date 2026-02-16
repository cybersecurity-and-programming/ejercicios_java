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
public class EjercicioDiez {
    //Pedir 15 números y escribir la suma total.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int sum = 0;
            for(int i = 0;i < 15; i++){
                System.out.println("Introduzca un numero");
                int num = read.nextInt();
                
                sum+=num;
            }
            System.out.println("El resultado es: "+sum);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
