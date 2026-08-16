/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadodela_clase;

import java.util.Scanner;

/**
 *1. Conocer las estructuras de selección
 *  a. Toma de decisión simple
 *  b. Toma de decisión doble
 *  c. Decisiones numericos y caracteres/cadenas 
 * @author Klari
 */

/* 
Se necesita desarrollar un algoritmo que determine si un bote de agua de 500ml esta 
arriba de la mitad. 

    a. Esta arriba de la mitad. (Dato númerico)
    b. Contiene agua o no. (Dato de caracter)
    c. Es amigable con el ambiente. (Dato de cadena) 
*/

public class Estadodela_clase {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // TODO code application logic here 
        
        Scanner input = new Scanner(System.in);
        //Conociendo la estructura 
        /*
        1.Palabra clava "If" y/o "else"
        2.El grupo de instucciones se encierra entre {}
        3.No se usa ";" para los bloques
        4.La condicion es una comparación bajo los siguientes elementos: 
            a. < menor 
            b. > mayor
            c. <= menor o igual 
            d. >= mayor o igual 
            e. == igual (Uso de dos signos)
       
        */
        
        int cantidadAgua = 0;
        char respuesta = '@';
        String respuestaAmbiente = "0";
        
        System.out.println("El bote es de 500 ml");
        System.out.println("Cuanto liquido dices que contiene? ");
        cantidadAgua = input.nextInt();
        
        //a. esta arriba de la mitad 
        if (cantidadAgua >=250){
            //Condición es VERDADERO
            System.out.println("Si, tiene más de la mitad");
            System.out.println("Te lo puedes beber!");
            System.out.println("No nos quedamos sin nada... hay suficiente");
        }
        input.nextLine(); //limpieza de buffer 
        System.out.println("");
        System.out.println("El liquido que contiene es H20? (a=si, b=no)");
        respuesta = input.nextLine().charAt (0);
        
        //Estructura de decisión doble (IF y ELSE)
        if (respuesta == 'a'){
            //Condición verdadera
            System.out.println("""
                               Si es agua lo que contiene
                               No es otra cosa...nada embriagante!!
                               """);
        }
        
        else {
            //Condición falsa
            System.out.println("""
                               UY UY UY
                               ¿Qué será...?
                               """);
        }
        
        System.out.printf("\nEse bote que contiene %d ml",cantidadAgua);
        System.out.println("\nEs amigable con el ambiente?");
        respuestaAmbiente = input.nextLine();
        System.out.printf("Dato de variable: %s", respuestaAmbiente);
        
        System.out.println("Seguro?");
        respuestaAmbiente = input.nextLine().toUpperCase();
        System.out.printf("Dato de variable: %s", respuestaAmbiente);
        
        System.out.println("100% Seguro?");
        respuestaAmbiente = input.next().toLowerCase();
        System.out.printf("Dato de variable: %s", respuestaAmbiente);
        
        if(respuestaAmbiente.equals("Si")){
            System.out.println("Es amigable");
        }    
        
        
        
        
        
        
    }//Fin de main 
    
       
}//Fin de class
