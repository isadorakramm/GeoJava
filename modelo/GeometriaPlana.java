package modelo;

public class GeometriaPlana {

    private double ladoA, ladoB, base, altura, diagonalMaior, diagonalMenor, baseMaior, baseMenor, raio;

    // quadrado 

    public void setQuadrado (double ladoA) {
        this.ladoA = ladoA;
    }

    public double areaQuadrado () {
        return Math.pow(ladoA, 2);
    }

    public double perimetroQuadrado () {
        return 4 * ladoA;
    }

    // retângulo

    public void setRetangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaRetangulo () { 
        return base * altura;
    }

    public double perimetroRetangulo () {
        return 2 * (base + altura);
    }

    // paralelogramo

    public void setParalelogramo (double base, double altura, double ladoA, double ladoB) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB; 
    }

    public double areaParalelogramo () { 
        return base * altura;
    }

    public double perimetroParalelogramo () {
        return 2 * (ladoA + ladoB);
    }

    // losango

    public void setLosango (double diagonalMaior, double diagonalMenor, double ladoA) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.ladoA = ladoA;
    }

    public double areaLosango () {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public double perimetroLosango () {
        return 4 * ladoA;
    }

    // trapézio

    public void setTrapezio (double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double areaTrapezio () {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double perimetroTrapezio () {
        return baseMaior + baseMenor + ladoA + ladoB;
    }

    // triângulo

    public void setTriangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaTriangulo () {
        return (base * altura) / 2;
    }

    public double perimetroTriangulo () {
        return base + ladoA + ladoB;
    }


    // círculo

    public void setCirculo (double raio) {
        this.raio = raio;
    }

    public double areaCirculo () {
        return Math.PI * Math.pow(raio, 2);
    }

    public double perimetroCirculo () {
        return 2 * Math.PI * raio;
    }

}
