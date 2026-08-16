/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversiones;

import java.util.Scanner;

/**
 *
 * @author Klari
 *//*Desarrollar un algoritmo que me permite convertir valores de longitud de acuerdo a la base que se tenga*/
// De acuerdo a la base que se tenga.
// Pulgadas - centimetros 
// Kilometros - Millas 
// Grados celsius a grados Farenheit


public class Conversiones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Todo code application logic here
    Scanner teclado = new Scanner (System.in);
        // Declaración Variables 
        int pulgada = 0;
        double resultadoCM = 0;
        
        double kilometros = 100;
        double millas = 0; 
        
        double Gcelsius = 0;
        double Gfarenheit = 0;
        
        System.out.println ("Tenemos 5 pulgadas");
        System.out.println ("Cuanto es eso en CM?");
        
        pulgada = 5;
        
        resultadoCM = 5 * 2.54;
       System.out.printf ("%d pulgadas es equivalente a %.2f cm",pulgada,resultadoCM);
        
       
      pulgada = 12;
      resultadoCM = pulgada * 2.54;
      System.out.printf ("\n% .2f cm es equivalente a %d pulgadas",resultadoCM,pulgada);
        
      System.out.printf ("\n Dime cuantos kilometros son?");
      kilometros = teclado.nextDouble();
      
      
      millas = kilometros / 1.6;
      System.out.printf ("%.2f km es = a%.3f millas", kilometros, millas);
      
      System.out.println (" \n Dime cuantos grados celcius son");
      Gcelsius = teclado.nextDouble ();
      
      // formula: Farenheit = (Celsius x 1.8)+32
      Gfarenheit = (Gcelsius * 1.8) + 32;
      System.out.printf ("% .2f Grados Celsius es = a % .3f Grados Farenheit", Gcelsius, Gfarenheit);
      
    } // Fin de main
    
    
    
    
}// Fin de class 
