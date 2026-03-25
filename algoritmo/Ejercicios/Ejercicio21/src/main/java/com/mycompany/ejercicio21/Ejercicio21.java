/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio21 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int EP;       
        int MAY = 0; 
        int MEN = 0;  

        for (int K = 1; K <= 200; K++) {
            System.out.print("Ingrese edad de la persona " + K + ": ");
            EP = sc.nextInt();

            if (EP < 18) {
                MEN = MEN + 1;
            } else {
                MAY = MAY + 1;
            }
        }

        System.out.println("Mayores de edad: " + MAY);
        System.out.println("Menores de edad: " + MEN);
    }
}
