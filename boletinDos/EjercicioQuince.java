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
public class EjercicioQuince {
    //Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
    //alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            byte edad;
            byte contEdad = 0;
            
            float medida;
            byte contMedida = 0;
            
            int resultadoEdad = 0;
            float resultadoMedida = 0;
            for(int i = 0;i<5;i++){
                System.out.println("Introduzca la edad");
                edad = read.nextByte();
                
                if(edad >= 18){
                    contEdad++;
                }
                resultadoEdad = resultadoEdad + edad;
                
                System.out.println("Introduzca altura de alumno");
                medida = read.nextFloat();
                
                if(medida >= 1.75){
                    contMedida++;
                }
                resultadoMedida = resultadoMedida + medida;
            }
            System.out.println("La edad media de los alumnos es --> "+(resultadoEdad/5)+" y la medida media de los alumnos es --> "+(resultadoMedida/5));
            System.out.println("El numero de alumnos mayor de 18 es --> "+contEdad+" y el numero de alumnos que miden mas de 1.75 es --> "+contMedida);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
