/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;
import java.util.Scanner;
/**
 *
 * @author Charly
 */
public class Proyecto {

    public static void main(String[] args) {
        int valor1,valor2,resultado;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("Digite el valor 1");
        valor1=teclado.nextInt();
        System.out.println("Digite el valor 2");
        valor2=teclado.nextInt();
        resultado=valor1+valor2;
        System.out.print("el resultado es "+ resultado);
        
        
    }  
}
        
