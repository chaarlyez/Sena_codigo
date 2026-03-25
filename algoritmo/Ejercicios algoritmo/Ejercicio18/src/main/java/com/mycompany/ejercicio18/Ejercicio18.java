/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        int NE,Q,R,MSG;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese un número de 2 cifras: ");
        NE=teclado.nextInt();
        Q= NE/2;
        R= NE-(Q*2);
        
        if (R==0) 
      {
            System.out.println("ES PAR ");
        }
        else {
                System.out.println("ES IMPAR ");
                }
        
                
    }
}
