/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Float nota1,nota2,nota3,promedio;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("Digite nota numero 1");
        nota1=teclado.nextFloat();
        System.out.println("Digite nota numero 2");
        nota2=teclado.nextFloat();
        System.out.println("Digite nota numero 3");
        nota3=teclado.nextFloat();
        promedio=(nota1+nota2+nota3)/3;
        System.out.println("El promedio es " + promedio);
    }
}
