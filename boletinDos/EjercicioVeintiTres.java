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
public class EjercicioVeintiTres {
    //Pedir 5 números e indicar si alguno es múltiplo de 3
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            boolean multiplo = false;
            for(int i = 0;i < 5;i++){
                System.out.println("Introduzca un numero");
                if((read.nextByte() % 3) == 0){
                    multiplo = true;
                }
            }
            System.out.println(multiplo ? "Se ha encontrado multiplos de 3" : "No se ha encontrado multiplos de 3");
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
