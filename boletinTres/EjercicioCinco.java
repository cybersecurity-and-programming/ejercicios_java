/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinTres;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioCinco {
    //Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    public static void main(String[] args) {
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 5;j++){
                for(int k = 0;k < 5;k++){
                   for(int l = 0;l < 5;l++){
                        for(int m = 0;m < 5;m++){
                            System.out.println(((i == 3) ? "E" : i)+"-"+((j == 3) ? "E" : j)+"-"+((k == 3) ? "E" : k)+"-"+((l == 3) ? "E" : l)+"-"+((m == 3) ? "E" : m));
                        }
                    }
                }
            }
            
        }
    }
}
