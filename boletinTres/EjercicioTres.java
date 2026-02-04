/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinTres;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioTres {
    //Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
    public static void main(String[] args) {
        for(int i = 1;i < 11;i++){
            System.out.println("---------TABLA DE MULTIPLICAR DE "+i+"---------");
            for(int j = 1;j < 11;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}
