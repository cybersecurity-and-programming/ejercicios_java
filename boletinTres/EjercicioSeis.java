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
public class EjercicioSeis {
    //Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
    public static void main(String[] args) {
        byte contPrime = 0;
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduzca un numero");
            byte num = read.nextByte();
            if(num > 0){
                for(byte i = 1;i < num;i++){
                    if(i % 2 != 0/*comprobar que no sea numero par*/ && isPrime(i)){
                        System.out.print(i+" ");
                        contPrime++;
                    }
                }
                System.out.println("");
            }
            System.out.println("Se han encontrado "+contPrime+" numeros primos");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
    private static boolean isPrime(byte num){
        for(int i=2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
