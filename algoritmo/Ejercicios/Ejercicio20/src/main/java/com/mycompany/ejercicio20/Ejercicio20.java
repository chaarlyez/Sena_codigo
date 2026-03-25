/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio20 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int NE;
        double SE;
        double SS=0;
        double SP;
                System.out.println("Digite numero de empleados");
                NE=sc.nextInt();
                
                for (int K = 1; K <= NE; K++) {
            System.out.print("Ingrese sueldo del empleado " +K+ ":");
            SE=sc.nextDouble();
            SS=SS+SE;
                }
                SP=SS/NE;
                System.out.println("Sueldo promedio: " + SP);
                
    }
}
