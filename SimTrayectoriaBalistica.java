/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simtrayectoriabalistica;

import java.util.Scanner;
/**
 * @author Klari
 * Ejercicio #3 - Estructuras de repetición 
   -----Simulación de trayectoria balística (Uso estricto de For)-----
   Escribe un programa que simule el lanzamiento de un proyectil. 
   * El usuario debe ingresar la velocidad inicial (en m/s) 
   * el ángulo de lanzamiento (en grados) 
   * Se tiene que buscar la fórmula correspondiente a la trayectoria.
   
   * Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
    entre 1 y 89 grados.
   
   * Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
    proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
    segundo 𝑡 = 10.
   
   * Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
    proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
    negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
    romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.  
 
 */
public class SimTrayectoriaBalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   Scanner entrada = new Scanner(System.in);
        
        // Declaracion de variables 
        double velInicial = 0;
        double angulo = 0;
        double gravedad = 9.8;
        double alturaMaxima = 0;
        int segundoAlturaMaxima = 0;
        
        do {
            System.out.print("Ingrese la velocidad inicial (m/s): ");
            velInicial = entrada.nextDouble();
            if (velInicial <= 0) {
                System.out.println("Error: La velocidad inicial debe ser mayor a 0.");
            }
        } while (velInicial <= 0);
        
        do {
            System.out.print("Ingrese el angulo de lanzamiento (grados): ");
            angulo = entrada.nextDouble();
            if (angulo < 1 || angulo > 89) {
                System.out.println("Error: El angulo debe estar entre 1 y 89 grados.");
            }
        } while (angulo < 1 || angulo > 89);
        
        double anguloRadianes = Math.toRadians(angulo);
      
        for (int t = 1; t <= 10; t++) {
            double altura = (velInicial * t * Math.sin(anguloRadianes)) - (0.5 * gravedad * t * t);
            
            System.out.println("En el segundo " + t + " la altura es de: " + altura + " metros.");
      
            if (altura < 0) {
                System.out.println("El proyectil impacto el suelo en el segundo " + t + "!");
                break; 
            }
           
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                segundoAlturaMaxima = t;
            }
        }
        System.out.println("La altura maxima estimada fue de " + alturaMaxima + " metros en el segundo " + segundoAlturaMaxima + ".");
       
    } // fin de main 
} // fin de class 
        
        
        
        
        
      
        
       
 