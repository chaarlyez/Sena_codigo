/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int E1,E2,DE;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("EDAD DEL PRIMER HERMANO");
        E1=teclado.nextInt();
        System.out.println ("EDAD DEL SEGUNDO HERMANO");
        E2=teclado.nextInt();
        if(E1>E2) {
        DE=E1-E2;  
            System.out.println("EL PRIMER HERMANO ES EL MAYOR, POR " + DE + " AÑOS" );
           }else{
        DE=E2-E1;     
            System.out.println("EL SEGUNDO HERMANO ES EL MAYOR, POR " + DE + "AÑOS" );
             
        }         
    }
}
