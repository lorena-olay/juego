/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.denoviembre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarao e inicializo las variables que necesito
        int jugador1, jugador2, rondas, suma, rondas1, rondas2;
        rondas1 = 0;
        rondas2 = 0;
        Scanner entradateclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        // TODO code application logic here
        //bucle para el número de rondas ganadas
        do {
            //creamos los datos del juego
            System.out.println("número aleatorio del jugador 1");
            jugador1 = numAleatorio.nextInt(6);
            System.out.println(jugador1);
            System.out.println("número aleatorio del jugador 2");
            jugador2 = numAleatorio.nextInt(6);
            System.out.println(jugador2);
            //calculo
            suma = jugador1 + jugador2;
            //condiciones de victoria y rondas
            if (suma < 7) {
                System.out.println("Jugador 1 ganas");
                rondas1++;
            } else if (suma > 7) {
                System.out.println("Jugador 2 ganas");
                rondas2++;
            } else {
                System.out.println("No gana ninguno");
            }
        } while (!(rondas1 == 5 || rondas2 == 5));
        if (rondas1 == 5){
            System.out.println("HAS GANADO JUGADOR 1!");
        } else {
            System.out.println("HAS GANADO JUGADOR 2");
        }

    }

}
