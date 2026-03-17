/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Float velocidad,tiempo,distancia;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("Digite el valor de la velocidad");
        velocidad=teclado.nextFloat();
        System.out.println("Digite el valor de el tiempo");
        tiempo=teclado.nextFloat();
        distancia=velocidad*tiempo;
        System.out.print("la distancia recorrida es " + distancia);
    }
}
