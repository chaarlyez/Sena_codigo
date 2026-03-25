/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        double MV, TB;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el monto de venta:");
        MV = teclado.nextDouble();

        if (MV >= 0 && MV < 1000) {
            TB = (0 * MV) / 100;
        } else if (MV >= 1000 && MV < 5000) {
            TB = (3 * MV) / 100;
        } else if (MV >= 5000 && MV < 20000) {
            TB = (5 * MV) / 100;
        } else if (MV >= 20000) {
            TB = (8 * MV) / 100;
        } else {
            System.out.println("Monto invalido");
            return;
        }

        System.out.println("Total de bonificacion: " + TB);
    }
    }

