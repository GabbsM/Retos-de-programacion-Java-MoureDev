package CalculadorAreasGeometricas;
/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class Principal {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println();
        System.out.println("CALCULO AREA CUADRADO: ");
        System.out.println();
        cuadrado.calcularArea();
        System.out.println();
        System.out.println("CALCULO AREA TRINGULO: ");
        System.out.println();
        triangulo.calcularArea();
        System.out.println();
        System.out.println("CALCULO AREA RECTANGULO: ");
        System.out.println();
        rectangulo.calcularArea();

    }



}

