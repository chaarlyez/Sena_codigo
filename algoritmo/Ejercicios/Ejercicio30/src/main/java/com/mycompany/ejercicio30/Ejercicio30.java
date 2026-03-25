/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio30;
import java.util.Scanner;
/**
 *
 * @author Charly
 */
public class Ejercicio30 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double N1, N2, S, P;

        System.out.print("Ingrese el primer número: ");
        N1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        N2 = sc.nextDouble();

        S = N1 + N2;   // suma
        P = S / 2;     // promedio

        System.out.println("Promedio: " + P);
    }
}
