/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int NE;
        Scanner teclado = new Scanner(System.in);

        String[] romanos = {
            "", "I", "II", "III", "IV", 
            "V", "VI", "VII", "VIII", "IX", "X"
        };

        System.out.println("Ingrese un numero del 1 al 10:");
        NE = teclado.nextInt();

        if (NE >= 1 && NE <= 10) {
            System.out.println("Equivalente en romano: " + romanos[NE]);
        } else {
            System.out.println("Numero fuera de rango");
        }
    }
}
