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
public class EjercicioSeis {
    //Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num = 0;
            int suma = 0;
            
            System.out.println("Introduzca un numero");
            while((num = read.nextInt()) != 0){
                suma += num;
                System.out.println("Introduzca un numero");
            }
            System.out.println("El resultado de la suma es "+suma);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
