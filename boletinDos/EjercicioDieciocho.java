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
public class EjercicioDieciocho {
    /**
     * Igual que el anterior pero suponiendo que no se introduce el precio por litro.Solo existen tres
     * productos con precios: 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
     * @param args
     */
    public static void main(String[] args) {
        byte codigo_articulo;//solo hay tres posibles codigos/articulo --> 1,2,3
        short cantidad_vendida;
        short contador_litros_art_1 = 0;
        
        float precio = 0;
        float importe_facturas = 0;
        byte num_facturas_600 = 0;
        float factura_total = 0;
        
        try(Scanner read = new Scanner(System.in)){
            for(int i=0; i<5; i++){
                System.out.println("Introduzca el codigo del articulo");
                codigo_articulo = read.nextByte();
                
                System.out.println("Introduzca la cantidad vendida en litros");
                cantidad_vendida = read.nextShort();
                
                switch (codigo_articulo) {
                    case 1 -> {
                        precio = (float) (0.6 * cantidad_vendida);
                        contador_litros_art_1 += cantidad_vendida;
                    }
                    case 2 -> {
                        precio = 3 * cantidad_vendida;
                    }
                    case 3 -> {
                        precio = (float) (1.25 * cantidad_vendida);
                    }
                    default -> throw new AssertionError("El rango de productos es 1,2,3");
                }
                if((importe_facturas = cantidad_vendida * precio) > 600){
                    num_facturas_600++;
                }
                factura_total += importe_facturas;
            }
            System.out.println("La facturacion total es --> "+factura_total+" y el numero de facturas mayor de 600 € es --> "+num_facturas_600);
            System.out.println("Los litros vendidos del articulo 1 son --> "+contador_litros_art_1+" litros");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }catch(AssertionError e){
            System.out.println("ERROR DE CODIGO DE PRODUCTO --> "+e.getMessage());
        }
    }
}