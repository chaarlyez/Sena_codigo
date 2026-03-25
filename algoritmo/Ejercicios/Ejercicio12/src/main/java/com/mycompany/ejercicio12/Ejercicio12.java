/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Charly
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner teclado=new Scanner (System.in);
        System.out.println ("primer numero entero");
        n1=teclado.nextInt();
        System.out.println ("segundo numero entero");
        n2=teclado.nextInt();
        System.out.println ("tercer numero entero");
        n3=teclado.nextInt();
        if (n1>n2)
        {
            if(n1>n3)
            {
             System.out.println("El primer numero es mayor "+n1);   
            }
            
        }
        else 
        {
            if(n2>n3)
            {
                 System.out.println("El segundo numero es mayor "+n2);
                 
            }
            else
            {
                 System.out.println("El 3 numero es mayor "+n3); 
            }
                
            
            
            }
    }
}
