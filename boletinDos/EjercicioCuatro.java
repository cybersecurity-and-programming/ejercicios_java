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
public class EjercicioCuatro {
    //Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int contador = 0;
            
            System.out.println("Introduzca un numero: ");
            while(read.nextInt() >= 0){
                contador++;
                System.out.println("Introduzca numero:");
            }
            System.out.println("Se han introducido "+contador+" numeros");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
