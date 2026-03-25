/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio17 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NE, D, U;

        System.out.print("Ingrese un número de 2 cifras: ");
        NE = sc.nextInt();

        // Proceso
        D = NE / 10;      // Decenas
        U = NE % 10;      // Unidades

        // Salida
        System.out.println("Decenas: " + D);
        System.out.println("Unidades: " + U);   
        
         
               
    }
}
