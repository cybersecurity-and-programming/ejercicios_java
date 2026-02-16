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
public class EjercicioVeintidos {
    //Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduzca un nota numero entre 0 y 99");
            byte num = read.nextByte();
            
            byte unidades = (byte) (num % 10);
            byte decenas = (byte) (num / 10);
            
            if(num >= 0 && num <= 99){
                System.out.println(leer_numero(decenas, unidades));
            }else{
                System.out.println("DEBE INTRODUCIR UN NUMERO ENTRE 0 Y 99");
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }catch(AssertionError e){
            System.out.println(e.getMessage());
        }
    }
    
    private static String leer_numero(byte decenas, byte unidades){
        String new_decenas = "";
        boolean type_range = false;
        switch (decenas) {
            case 0 -> new_decenas = "";
            case 1 -> {
                if(unidades >= 1 && unidades <= 5){
                    new_decenas = leer_diez(unidades);
                    type_range = true;
                }else{
                    new_decenas = "DIEZ";
                }
            }
            case 2 -> {
                if(unidades == 0){
                    new_decenas ="VEINTE";
                }else{
                    new_decenas = "VEINTI";
                }
            }
            case 3 -> new_decenas = "TREINTA";
            case 4 -> new_decenas = "CUARENTA";
            case 5 -> new_decenas = "CINCUENTA";
            case 6 -> new_decenas = "SESENTA";
            case 7 -> new_decenas = "SETENTA";
            case 8 -> new_decenas = "OCHENTA";
            case 9 -> new_decenas = "NOVENTA";
            default -> throw new AssertionError("LAS DECENAS DEBEN SER VALORES COMPRENDIDOS ENTRE 0 Y 9");
        }
        if(new_decenas.equals("")){
            return leer_unidades(unidades);
        }else{
            return type_range ? new_decenas : new_decenas + ((unidades == 0 || decenas == 2) ? "" : " Y ")+leer_unidades(unidades);
        }
    }
    
    private static String leer_diez(byte num){
        String new_num = "";
        switch (num) {
            case 1 -> new_num = "ONCE";
            case 2 -> new_num = "DOCE";
            case 3 -> new_num = "TRECE";
            case 4 -> new_num = "CATORCE";
            case 5 -> new_num = "QUINCE";
            default -> throw new AssertionError("NUMERO NO VALIDO, DEBERÍA ESTAR COMPRENDIDO ENTRE 1 Y 5 PARA ESTA FUNCION");
        }
        return new_num;
    }
 
    private static String leer_unidades(byte unidades){
        String new_unidades = "";
        switch (unidades) {
            case 0 -> new_unidades = "";
            case 1 -> new_unidades = "UNO";
            case 2 -> new_unidades = "DOS";
            case 3 -> new_unidades = "TRES";
            case 4 -> new_unidades = "CUATRO";
            case 5 -> new_unidades = "CINCO";
            case 6 -> new_unidades = "SEIS";
            case 7 -> new_unidades = "SIETE";
            case 8 -> new_unidades = "OCHO";
            case 9 -> new_unidades = "NUEVE";
            case 10 -> new_unidades = "DIEZ";
            default -> throw new AssertionError("NUMERO NO VALIDO, ES NECESARIO QUE INTRODUCIR UN NUMERO ENTRE 0 Y 10");
        }
        return new_unidades;
    }
}