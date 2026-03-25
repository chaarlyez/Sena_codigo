/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio27;
import java.util.Scanner;
/**
 *
 * @author Charly
 */
public class Ejercicio27 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double N1, N2, R = 0;
        char OP;

        System.out.print("Ingrese primer número: ");
        N1 = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        N2 = sc.nextDouble();

        System.out.print("Ingrese operador (+, -, *, ^): ");
        OP = sc.next().charAt(0);

        switch (OP) {
            case '+':
                R = N1 + N2;
                break;
            case '-':
                R = N1 - N2;
                break;
            case '*':
                R = N1 * N2;
                break;
            case '^':
                R = Math.pow(N1, N2); // potencia
                break;
            default:
                System.out.println("Operador no válido");
        }

        System.out.println("Resultado: " + R);  
    }
}
