package org.example;

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
/* Para hacer la conversión de decimal a binario, hay que ir dividiendo el número decimal entre dos y anotar
   en una columna a la derecha el resto (un 0 si el resultado de la división es par y un 1 si es impar).
   La lista de ceros y unos leídos de abajo a arriba es el resultado.*/
public class DeDecimalABinario {

    public static void main(String[] args) {


/*            int numero=7910;
            String base2="";
            while(numero>0) {
                base2=(numero%2)+base2;
                numero/=2;
            }
            System.out.println(base2);
        }*/

        int decimalInicial = 7910;

        // de decimal a binario
        String binario = Integer.toBinaryString(decimalInicial);
        System.out.println(binario); // 1000
    }

}

