/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinUno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioVeinte {
    //Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca hora");
            byte hora = read.nextByte();
            
            System.out.println("Introduzca minutos");
            byte minutos = read.nextByte();
            
            System.out.println("Introduzca segundos");
            byte segundos = read.nextByte();
            
            if((hora > 24) || (minutos > 60) || (segundos > 60)){
                System.out.println("La hora introducida no es correcta. Introduzca un formato correcto");
            }else{
                segundos++;
                if(segundos == 60){
                    segundos = 0;
                    minutos++;
                }
                
                if(minutos == 60){
                    minutos = 0;
                    hora++;
                }
                
                if(hora == 25){
                    hora=0;
                }
                
                System.out.println(hora+":"+minutos+":"+segundos);
            }
        }catch (InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}