/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int AN,AA,E;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("AÑO DE NACIMIENTO");
        AN=teclado.nextInt();
        System.out.println ("AÑO ACTUAL");
        AA=teclado.nextInt();
        E=AA-AN;
        if(E>17) {
        E=AA-AN;
            System.out.println("ES MAYOR DE EDAD: " + E + " AÑOS" );
        }else{
             System.out.println("ES MENOR DE EDAD: " + E + " AÑOS");
        }
        
    }
}
