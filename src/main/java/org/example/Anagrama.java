package org.example;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {

        anagrama();



    }

    public static void anagrama(){
        String palabra1;
        String palabra2;

        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe una palabra: ");
        palabra1 = sc.next();

        System.out.println("Escribe otra palabra: ");
        palabra2 = sc.next();

        String palabra1Minus = palabra1.toLowerCase();
        String palabra2Minus = palabra2.toLowerCase();

        if(palabra1Minus.length() == palabra2Minus.length()){
            for (int i = 0; i < palabra1Minus.length(); i++) {
                if(!palabra2Minus.contains(String.valueOf(palabra1Minus.charAt(i)))){
                    System.out.println("La palabra no es un anagrama");

                }
            }
            System.out.println("La palabra es un anagrama");
        }
    }

}
