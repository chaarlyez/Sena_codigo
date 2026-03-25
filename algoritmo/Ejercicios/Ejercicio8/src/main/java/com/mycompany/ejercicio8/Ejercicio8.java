/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio8 {

    public static void main(String[] args) {
       Double AA,AB,OA,OB,D;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("ABCISA DE A");
        AA=teclado.nextDouble();
        System.out.println("ABCISA B");
        AB=teclado.nextDouble();
        System.out.println("ORDENADA A");
        OA=teclado.nextDouble();
        System.out.println("ORDENADA B");
        OB=teclado.nextDouble();
        D=Math.sqrt(Math.pow(AB-AA,2)+Math.pow(OB-OA,2));
        System.out.println("DISTANCIA ENTRE LOS PUNTOS: " + D);
    }
}
