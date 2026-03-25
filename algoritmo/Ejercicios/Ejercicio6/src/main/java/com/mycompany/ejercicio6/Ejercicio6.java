/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Double LA,LB,LC,LS,AT;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("LADO A");
        LA=teclado.nextDouble();
        System.out.println("LADO B");
        LB=teclado.nextDouble();
        System.out.println("LADO C");
        LC=teclado.nextDouble();
        LS=(LA+LB+LC)/2;
        AT=Math.sqrt(LS*(LS-LA)*(LS-LB)*(LS-LC));
        System.out.println("AREA DEL TRIANGULO: " + AT);
    }
}
