package modelo;

import java.lang.Math;

public class GeometriaPlana {

    private double lado, base, altura, diagonalMaior, diagonalMenor, baseMaior, baseMenor, raio;

    // construtor

    public quadrado (double lado) {
        this.base = lado
    }

    public retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public paralelogramo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public losango (double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    public trapezio (double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public triangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public circulo (double raio) {
        this.raio = raio;
    }


    // áreas

    // área do quadrado
    public areaQuadrado (double lado) {
        return Math.pow(lado, 2);
    }

    // área do retângulo e do paralelogramo
    public areaRP (double base, double altura) { 
        return base * altura;
    }

    // área do losango
    public areaLosango (double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    // área do trapézio
    public areaTrapezio (double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // triângulos
    public areaTriangulo (double base, double altura) {
        return (base * altura) / 2;
    }

    // área do círculo
    public areaCirculo (double raio) {
        return Math.PI * Math.pow(raio, 2);
    }


    // perímetros

    // perímetro do quadrado
    public perimetroQuadrado (double lado) {
        return 4 * lado;
    }

    // perímetro do retângulo e paralelogramo
    public perimetroRP (double base, double altura) {
        return 2 * (base + altura);
    }

    // perímetro do losango
    public perimetroLosango (double lado) {
        return 4 * lado;
    }

    //
}
