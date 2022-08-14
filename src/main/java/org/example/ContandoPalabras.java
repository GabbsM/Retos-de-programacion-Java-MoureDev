package org.example;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

import java.util.HashMap;
import java.util.Map;

public class ContandoPalabras {

    public static void main(String[] args) {


        //Escribimos la frase
        String frase = "Este es un ejercicio de contar las palabras. Las palabras son importantes en este ejercicio";

        //La convertimos en minuscula.

        String fraseMinuscula = frase.toLowerCase().trim();

        // Quitar puntos, comas, etcétera.
        fraseMinuscula = fraseMinuscula.replaceAll("[\\.\\,\\(\\)]", "");

        // Separar cada palabra por espacio y convertir a arreglo.
        String palabras[] = fraseMinuscula.split(" ");

        // Mapa en donde almacenamos la frecuencia.
        HashMap<String,Integer> mapaConteo = new HashMap<>();

        for (String palabra: palabras){
            if(mapaConteo.containsKey(palabra)){
                mapaConteo.put(palabra,mapaConteo.get(palabra) + 1);

            }else {
                mapaConteo.put(palabra,1);

            }
        }

        //Imprimimos mapa:

        for (HashMap.Entry<String, Integer> entry : mapaConteo.entrySet()) {
            System.out.printf("Palabra: '%s' aparece un total de %d\n ", entry.getKey(), entry.getValue());
        }

    }
}
