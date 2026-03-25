/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14_1;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio14_1 {

    public static void main(String[] args) {
        
    int NE;
        String ER;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 10:");
        NE = teclado.nextInt();

        switch (NE) {
            case 1:
                ER = "I";
                break;
            case 2:
                ER = "II";
                break;
            case 3:
                ER = "III";
                break;
            case 4:
                ER = "IV";
                break;
            case 5:
                ER = "V";
                break;
            case 6:
                ER = "VI";
                break;
            case 7:
                ER = "VII";
                break;
            case 8:
                ER = "VIII";
                break;
            case 9:
                ER = "IX";
                break;
            case 10:
                ER = "X";
                break;
            default:
                System.out.println("Numero fuera de rango");
                return;
        }

        System.out.println("Equivalente en romano: " + ER);
    }
}
