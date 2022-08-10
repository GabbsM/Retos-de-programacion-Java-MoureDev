package CalculadorAreasGeometricas;

import java.util.Scanner;

public class Rectangulo implements CalculadorAreas{
    @Override
    public void calcularArea() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica base: ");
        int base = sc.nextInt();
        System.out.println("Indica altura: ");
        int alturan = sc.nextInt();

        System.out.println("El area del rectangulo es de " + base*alturan);

    }
}
