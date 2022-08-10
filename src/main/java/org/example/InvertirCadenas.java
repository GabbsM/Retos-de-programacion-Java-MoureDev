package org.example;
/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class InvertirCadenas {

    public static void main(String[] args) {


        String cadena = "Mi nombre es Gabriel";
        String invertida = " ";

        for (int i = cadena.length()-1; i >= 0 ; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }

}
