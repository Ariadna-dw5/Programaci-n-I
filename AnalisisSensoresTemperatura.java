/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisissensorestemperatura;

import java.util.Scanner;

/**
 * @author Ariadna
 * 
 * Ejercicio #1 - Estructuras de repetición 
 * -----Analisis de sensores de temperatura (uso While)-----
 * Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
   registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
   centinela −999
   * Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
     el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
     mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.

   • Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
     ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída. 
 */
public class AnalisisSensoresTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   Scanner input = new Scanner (System.in); 
   
    // Declaracion de variables   
       double temp = 0; 
       double suma = 0;
       double tempValida = 0;
       double tempAlta = 0;
       double tempBaja = 0;        
               
     System.out.println ("----Analisis de sensores de temperatura----");   
     System.out.println ("si desea detener el programa, ingrese -999.");
       
     System.out.println ("Temperatura: ");
     temp = input.nextDouble();
     
     while (temp != -999){
         
         if (temp < -273.15){
             System.out.println ("Error!, temperatura no existente. Intentelo nuevamente.");
         } else {
             
        suma = suma + temp;
        tempValida ++;
         }
       
        if (tempValida == 1) {
         tempAlta = temp;
         tempBaja = temp;
     } else {
            if (temp>tempAlta) tempAlta = temp;
            if (temp<tempBaja) tempBaja = temp;
        }
     System.out.println ("Temperatura: ");
     temp = input.nextDouble();
     
     }
     System.out.println ("-----------------------------------------------");
     if (tempValida == 0){
         System.out.println ("¡No ha ingresado temperaturas validas!");
     } else {
         System.out.println ("Promedio: " + (suma/tempValida));
         System.out.println ("Temperatura mas alta: " + tempAlta );
         System.out.println ("Temperatura mas baja: " + tempBaja);
         System.out.println ("Diferencia de temperatura:" + (tempAlta - tempBaja));
     }
                 
        
    } // Fin del main 
    
} // Fin de class
