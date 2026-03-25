/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int HL,TH,TP;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("HORAS LABORADAS");
        HL=teclado.nextInt();
        System.out.println("TARIFA HORA");
        TH=teclado.nextInt();
        TP=TH*HL;
        System.out.println("TOTAL A PAGAR: " + TP);
    }
}
