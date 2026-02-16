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
public class EjercicioDos {
    //Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num = 0;
            
            System.out.println("Introduzca un numero: ");
            while((num = read.nextInt()) != 0){
                System.out.println("El numero introducido es: "+num);
                System.out.println("Introduzca un numero: ");
            }
            System.out.println("ADIOS");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
