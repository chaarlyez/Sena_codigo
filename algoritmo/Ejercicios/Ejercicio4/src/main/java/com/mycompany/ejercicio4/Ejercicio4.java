/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int PG,PE,PP,PPG,PPE,PT;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("PARTIDOS GANADOS");
        PG=teclado.nextInt();
        System.out.println("PARTIDOS EMPATADOS");
        PE=teclado.nextInt();
        System.out.println("PARTIDOS PERDIDOS");
        PP=teclado.nextInt();
        PPG=PG*3;
        PPE=PE*1;
        PT=PPG+PPE;
        System.out.println("EL PUNTAJE FINAL ES: " + PT);
    }
}
