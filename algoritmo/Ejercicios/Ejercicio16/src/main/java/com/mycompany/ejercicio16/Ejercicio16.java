/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int NE;
        String V;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 5:");
        NE = teclado.nextInt();

        switch (NE) {
            case 1:
                V = "A";
                break;
            case 2:
                V = "E";
                break;
            case 3:
                V = "I";
                break;
            case 4:
                V = "O";
                break;
            case 5:
                V = "U";
                break;
            
         
            default:
                System.out.println("Valor incorrecto");
                return;
        }

        System.out.println("Equivalente a la vocal1: " + V);
    
    }
}
         
