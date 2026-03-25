/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio26;

/**
 *
 * @author Charly
 */
public class Ejercicio26 {

    public static void main(String[] args) {
    int A = 0;
        int B = 1;
        int C;

        System.out.println(A);
        System.out.println(B);

        C = A + B;

        while (C < 100000) {
            System.out.println(C);

            A = B;
            B = C;
            C = A + B;
        }    
    }
}
