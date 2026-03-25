/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int PL,PMa,PMi,PJ,PV,PS,PT,PP;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("PRODUCCION DIA LUNES");
        PL=teclado.nextInt();
        System.out.println ("PRODUCCION DIA MARTES");
        PMa=teclado.nextInt();
        System.out.println ("PRODUCCION DIA MIERCOLES");
        PMi=teclado.nextInt();
        System.out.println ("PRODUCCION DIA JUEVES");
        PJ=teclado.nextInt();
        System.out.println ("PRODUCCION DIA VIERNES");
        PV=teclado.nextInt();
        System.out.println ("PRODUCCION DIA SABADO");
        PS=teclado.nextInt();
        PT=(PL+PMa+PMi+PJ+PV+PS);
        PP=PT/6;
        System.out.println("PRODUCCION TOTAL: "+PT);
        System.out.println("PROMEDIO DE PRODUCCION: "+PP);
        if(PP>=100){
             System.out.println("RECIBIRA INCENTIVOS");
            }else{
             System.out.println("NO RECIBIRA INCENTIVOS");
             }
        }
}
