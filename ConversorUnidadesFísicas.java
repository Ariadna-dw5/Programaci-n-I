/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidadesfísicas;

import java.util.Scanner;
/**
 * @author Klari
 * Ejercicio #2 - Estructuras de repetición 
 * ----- Conversor de unidades físicas (Uso Do-While) -----
 * Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
 debe mostrar las opciones: 
 1) Metros a Pies
 2) Kilogramos a Libras
 3) Centímetros a Pulgadas
 4) Salir.
  
 • Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.

• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
*
 */
public class ConversorUnidadesFísicas {

    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        //Declaración de variables 
        int opcion;
        double metros = 0; 
        double pies;
        double kilogramos = 0;
        double libras;
        double centimetros = 0; 
        double pulgadas;
         
        do {
            System.out.println ("---- Conversor de unidades fisicas ----");
            System.out.println ("Elige una opcion: ");
            System.out.println ("1) Metros a pies");
            System.out.println ("2) Kilogramos a libras");
            System.out.println ("3) Centimetros a pulgadas");
            System.out.println ("4) Salir");
            
            opcion = input.nextInt(); 
            
            switch (opcion){
                case 1:
                    do {
                        System.out.println ("Ingrese la longitud en metros: ");
                        metros = input.nextDouble ();
                        if (metros < 0){
                            System.out.println("No puede ingresar cifras o numeros negativos, intentelo nuevamente.");
                        }    
                    } while (metros < 0);
                    
                    pies = metros * 3.28084;
                    System.out.println (metros + " metros equivalen a: " + pies + " pies. \n");     
                    break;
                
                case 2:
                    do {
                        System.out.println ("Ingrese la cantidad en kilogramos: ");
                        kilogramos = input.nextDouble ();
                        if (kilogramos < 0) {
                            System.out.println("No puede ingresar cifras o numeros negativos, intentelo nuevamente.");
                        }
                    } while (kilogramos < 0);
                    
                    libras = kilogramos * 2.20462;
                    System.out.println (kilogramos + " kilogramos equivalen a: " + libras + " libras. \n");
                    break;
                
                case 3: 
                    do {
                        System.out.println ("Ingrese la cifra en centimetros: ");
                        centimetros = input.nextDouble ();
                        if (centimetros < 0) {
                            System.out.println ("No puede ingresar cifras o numeros negativos, intentelo nuevamente.");
                        }
                    } while (centimetros < 0);
                    
                    pulgadas = centimetros / 2.54;
                    System.out.println (centimetros + " centimetros equivalen a: " + pulgadas + " pulgadas. \n");
                    break;    
                
                case 4:
                    System.out.println ("Saliendo, proceso terminado.");
                    break;
               
                default:
                    System.out.println("Opcion invalida, elige un numero del 1 al 4.\n");
                    break;
            }

        } while(opcion != 4);
        
      
    } //fin de main
} //fin de class