/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int RC,RI,PRC,RB,PRI,PF;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("RESPUESTAS CORRECTAS");
        RC=teclado.nextInt();
        System.out.println("RESPUESTAS INCORRECTAS");
        RI=teclado.nextInt();
        System.out.println("RESPUESTAS EN BLANCO");
        RB=teclado.nextInt();
        PRC=RC*4;
        PRI=RI*-1;
        PF=PRC+PRI;
        System.out.println("EL PUNTAJE FINAL ES: " + PF);
    }
}
