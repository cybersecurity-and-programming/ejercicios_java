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
public class EjercicioTrece {
    //Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            int num = 0;
            //variables para contar el tipo de numero introducido
            byte num_cero = 0;
            byte num_positivo = 1;
            byte num_negativo = 1;
            
            //variables utilizadas para realizar las operaciones arimeticas
            byte resultado_positivo = 0;
            byte resultado_negativo = 0;
            
            for(int i = 0;i < 10;i++){
                System.out.println("Introduzca un numero");
                num = read.nextInt();
                
                if(num == 0){
                    num_cero++;
                }else{
                    if(num >= 0){
                        resultado_positivo += num;
                        num_positivo++;
                    }else{
                        resultado_negativo += num;
                        num_negativo++;
                    }
                }
            }
            System.out.println("La media de los numeros positivos son: "+(resultado_positivo/num_positivo));
            System.out.println("La media de los numeros negativos son: "+(resultado_negativo/num_negativo));
            System.out.println("El numero de ceros es: "+num_cero);
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}