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
        int jugador1, jugador2, rondas, suma, rondas1, rondas2;
        rondas1 = 0;
        rondas2 = 0;
        Scanner entradateclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        // TODO code application logic here
        do{
        System.out.println("número aleatorio del jugador 1");
        jugador1 = numAleatorio.nextInt(6);
        System.out.println("número aleatorio del jugador 2");
        jugador2 = numAleatorio.nextInt(6);
        suma = jugador1 + jugador2;
        if (suma < 7) {
            System.out.println("Jugador 1 ganas");
        } else if (suma > 7) {
            System.out.println("Jugador 2 ganas");
        } else if (suma == 7) {
            System.out.println("No gana ninguno");
        }
        if (suma < 7) {
            rondas1++;
        } else if (suma > 7){
            rondas2++;
        }
        }while(!(rondas1 == 3 || rondas2 == 3));

    }

}
