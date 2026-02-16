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
public class EjercicioSeis {
    //Pedir dos números y decir si uno es múltiplo del otro.
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca primer numero");
            short num1 = read.nextShort();
            
            System.out.println("Introduzca segundo numero");
            short num2 = read.nextShort();
            
            if(num1 < num2){
                System.out.println("Para un resultado correcto, el primer numero debe ser mayor que el segundo");
            }else{
                String data = (num1%num2 == 0) ? "Los numeros son multiplos" : "Los numeros no son multiplos";
                System.out.println(data);
            }
        }catch(InputMismatchException e){
            System.out.println("LOS NUMEROS INTRODUCIDOS NO TIENEN EL FORMATO CORRECTOS");
        }
    }
}
