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
public class EjercicioDieciNueve {
    public static void main(String[] args) {
        //Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
        try(Scanner read = new Scanner(System.in)){
            byte calificacion = 0;
            
            byte contador_suspenso = 0;
            byte contador_condicionado = 0;
            byte contador_aprobado = 0;
            
            repetir:for(int i = 0;i < 6;i++){
                calificacion = read.nextByte();
                
                if(!(calificacion >= 0 && calificacion <=10)){
                    i--;
                    System.out.println("Se ha introducido una nota incorrecta, introduzcala otra vez");
                    continue;
                }
                
                if(calificacion < 4){
                    contador_suspenso += 1;
                }else{
                    if(calificacion == 4){
                        contador_condicionado += 1;
                    }else{
                        contador_aprobado += 1;
                    }
                }
            }
            System.out.println("El numero de alumnos suspensos son: "+contador_suspenso+".\n El numero de alumnos condicionados son: "+contador_condicionado+".\n El numero de alumnos aprobados son: "+contador_aprobado);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
