package org.example;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int numAux;


        while (num1+num2 <= 100){

            numAux = num1;
            num1 = num2;
            num2 = numAux+num1;
            System.out.println(num2);
        }

    }





}
