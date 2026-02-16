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
public class EjercicioTres {
    //Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num = 0;
            
            System.out.println("Introduzca un numero: ");
            while((num = read.nextInt()) != 0){
                if(num % 2 == 0){
                    System.out.println("El numero es par");
                }else{
                    System.out.println("El numero es impar");
                }
            }
            System.out.println("ADIOS");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
