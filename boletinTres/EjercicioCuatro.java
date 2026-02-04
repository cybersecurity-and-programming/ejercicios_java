/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinTres;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioCuatro {
    //Dibuja un cuadrado de n elementos de lado utilizando *.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduzca lado del cuadrado");
            byte num = read.nextByte();
            
            for(int i = 0;i < num;i++){
                for(int j = 0;j < num;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
