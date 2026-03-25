/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int L1,L2,L3;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("primer lado del triangulo");
        L1=teclado.nextInt();
        System.out.println ("segundo lado del triangulo");
        L2=teclado.nextInt();
        System.out.println ("tercer lado del triangulo");
        L3=teclado.nextInt();
         if (L1 > L2 && L1 > L3) {
            System.out.println("El trinagulo es Escanelo " );
        } else if (L2 > L1 && L2 > L3) {
            System.out.println("El trinagulo es Equilatero " );
        } else {
            System.out.println("El trinagulo es Isosceles");
        }
                
            
        }
        
    }
