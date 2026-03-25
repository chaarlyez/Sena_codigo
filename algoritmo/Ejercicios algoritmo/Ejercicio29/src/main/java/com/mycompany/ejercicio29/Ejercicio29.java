/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio29;
import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio29 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        int VE;         // voto del elector
        int C1 = 0;     // candidato 1
        int C2 = 0;     // candidato 2
        int C3 = 0;     // candidato 3
        int CO = 0;     // nulo o blanco
        int G;          // ganador

        for (int K = 1; K <= 160; K++) {
            System.out.print("Ingrese voto del elector " + K + " (1, 2, 3; otro = nulo/blanco): ");
            VE = sc.nextInt();

            switch (VE) {
                case 1:
                    C1++;
                    break;
                case 2:
                    C2++;
                    break;
                case 3:
                    C3++;
                    break;
                default:
                    CO++;
            }
        }

        if ((C1 > C2) && (C1 > C3) && (C1 > CO)) {
            G = 1;
        } else if ((C2 > C3) && (C2 > CO)) {
            G = 2;
        } else if (C3 > CO) {
            G = 3;
        } else {
            G = 0; // nulo o blanco
        }

        System.out.println("Votos candidato 1: " + C1);
        System.out.println("Votos candidato 2: " + C2);
        System.out.println("Votos candidato 3: " + C3);
        System.out.println("Votos nulos o blancos: " + CO);
        System.out.println("Ganador: " + G);
    }
}
