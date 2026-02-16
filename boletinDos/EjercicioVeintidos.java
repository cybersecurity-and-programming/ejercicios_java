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
public class EjercicioVeintidos {
    //Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            boolean suspenso = false;
            for(int i = 0;i < 5;i++){
                System.out.println("Introduce nota del alumno");
                if(read.nextByte() < 5){
                    suspenso = true;
                }
            }
            System.out.println(suspenso ? "Se ha encontrado suspensos" : "No hay suspensos");
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
