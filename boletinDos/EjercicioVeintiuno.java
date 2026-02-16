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
public class EjercicioVeintiuno {
    //Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            boolean numNegativo = false;
            for(int i = 0; i < 10; i++){
                System.out.println("Introduzca un numero");
                byte num = read.nextByte();
                
                if(num < 0){
                    numNegativo = true;
                }
            }
            if(numNegativo){
                System.out.println("Se ha introducido un numero negativo");
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
