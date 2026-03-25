/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;
import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int PN, SN; // Primer Número y Segundo Número
        int P = 0;  // Producto

        System.out.print("Ingrese el primer número: ");
        PN = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        SN = sc.nextInt();

        // Sumas sucesivas
        for (int k = 1; k <= SN; k++) {
            P = P + PN;
        }

        System.out.println("Producto: " + P);
    }
}
