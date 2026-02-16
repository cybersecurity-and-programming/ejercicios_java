/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinDos;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioOnce {
    //Diseñar un programa que muestre el producto de los 10 primeros números impares
    public static void main(String[] args) {
        int resultado = 1;
        for(int i = 1;i < 20;i+=2){
            resultado= resultado * i;
        }
        System.out.println("El resultado es: "+resultado);
    }
}
