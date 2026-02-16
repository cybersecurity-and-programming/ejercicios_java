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
public class EjercicioDiecisiete {
    /**
     * Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
     * facturas.En cada factura figura: el código del artículo, la cantidad vendida en litros y el 
     * precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
     * y cuantas facturas se emitieron de más de 600 €. ----
     * @param args
     */
    public static void main(String[] args) {
        byte codigo_articulo;//solo hay tres posibles codigos/articulo --> 1,2,3
        short cantidad_vendida;
        float precio;
        
        float importe_facturas = 0;
        byte num_facturas_600 = 0;
        float factura_total = 0;
        
        short contador_litros_art_1 = 0;
        try(Scanner read = new Scanner(System.in)){
            for(int i=0; i<5; i++){
                System.out.println("Introduzca el codigo del articulo");
                codigo_articulo = read.nextByte();
                
                System.out.println("Introduzca la cantidad vendida en litros");
                cantidad_vendida = read.nextShort();
                
                System.out.println("Introduzca el precio por litros");
                precio = read.nextFloat();
                
                if(codigo_articulo == 1){
                    contador_litros_art_1 += cantidad_vendida;
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
        }
    }
}