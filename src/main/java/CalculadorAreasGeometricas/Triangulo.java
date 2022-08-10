package CalculadorAreasGeometricas;

import java.util.Scanner;

public class Triangulo implements CalculadorAreas{
    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica altura: ");
        int altura = sc.nextInt();
        System.out.println("indica base: ");
        int base = sc.nextInt();

        int resultado = (altura*base)/2;

        System.out.println("El area del triangulo mide " + resultado);

    }
}
