/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio28;
import java.util.Scanner;
/**
 *
 * @author Charly
 */
public class Ejercicio28 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        char L;
        int NV = 0; // número de vocales
        int NC = 0; // número de consonantes

        for (int K = 1; K <= 10; K++) {
            System.out.print("Ingrese la letra " + K + ": ");
            L = sc.next().charAt(0);

            switch (L) {
                case 'A': case 'a':
                case 'E': case 'e':
                case 'I': case 'i':
                case 'O': case 'o':
                case 'U': case 'u':
                    NV = NV + 1;
                    break;
                default:
                    NC = NC + 1;
            }
        }

        System.out.println("Número de vocales: " + NV);
        System.out.println("Número de consonantes: " + NC);  
    }
}
