package CalculadorAreasGeometricas;

import java.util.Scanner;

public class Cuadrado implements CalculadorAreas{
    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica cuanto miden los lados del cuadrado: ");
        double lado = sc.nextDouble();
        double resultado = Math.pow(lado,2);
        System.out.println("El area del cuadrado es " + resultado);

    }
}
