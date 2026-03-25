/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;
  import java.util.Scanner;
/**
 *
 * @author Charly
 */
public class Ejercicio25 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        char L;
        boolean semaforo = true;

        while (semaforo) {
            System.out.print("Ingrese una letra: ");
            L = sc.next().charAt(0);

            switch (L) {
                case 'a': case 'A':
                case 'e': case 'E':
                case 'i': case 'I':
                case 'o': case 'O':
                case 'u': case 'U':
                    semaforo = false; // detener
                    break;
                default:
                    semaforo = true; // continuar
            }
        }

        System.out.println("Se ingresó una vocal. Fin del programa.");
    }
}  
   

