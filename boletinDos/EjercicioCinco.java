/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinDos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioCinco {
    /*
    Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
    números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
    cuando el usuario acierta.
    */
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num_n = 0;
            
            Random rnd = new Random();
            int random_num = getRandom(20, 70, rnd);//obtiene numero aleatorio entre el rango especificado

            System.out.println("Introduzca numero:");
            while(random_num != (num_n = read.nextInt())){
                if(num_n < random_num){
                    System.out.println("MAYOR");
                }else{
                    System.out.println("MENOR");
                }
            }
            System.out.println("El numero es correcto");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
    //(r.nextInt(5) + 1) * 100; -- n=(int)(Math.random()*100)+1;
    private static int getRandom(int lowerBound, int upperBound, Random rnd) {
        return lowerBound + rnd.nextInt(upperBound - lowerBound + 1);
    }
}
