/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

/**
 *
 * @author Charly
 */
public class Ejercicio23 {

    public static void main(String[] args) {
       int contador = 0;
        int numero = 1;

        while (contador < 10) {
            if (numero % 2 != 0) { // si es impar
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
