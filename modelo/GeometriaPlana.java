package modelo;

public class GeometriaPlana {

    private double ladoA, ladoB, base, altura, diagonalMaior, diagonalMenor, baseMaior, baseMenor, raio;

    public void setQuadrado (double ladoA) {
        this.ladoA = ladoA;
    }

    public void setRetangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setParalelogramo (double base, double altura, double ladoA, double ladoB) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB; 
    }

    public void setLosango (double diagonalMaior, double diagonalMenor, double ladoA) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.ladoA = ladoA;
    }

    public void setTrapezio (double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public void setTriangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setCirculo (double raio) {
        this.raio = raio;
    }


    // áreas

    // área do quadrado
    public double areaQuadrado () {
        return Math.pow(ladoA, 2);
    }

    // área do retângulo e do paralelogramo
    public double areaRP () { 
        return base * altura;
    }

    // área do losango
    public double areaLosango () {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    // área do trapézio
    public double areaTrapezio () {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // triângulos
    public double areaTriangulo () {
        return (base * altura) / 2;
    }

    // área do círculo
    public double areaCirculo () {
        return Math.PI * Math.pow(raio, 2);
    }


    // perímetros

    // perímetro do quadrado
    public double perimetroQuadrado () {
        return 4 * ladoA;
    }

    // perímetro do retângulo e paralelogramo
    public double perimetroRP () {
        return 2 * (base + altura);
    }

    // perímetro do losango
    public double perimetroLosango () {
        return 4 * ladoA;
    }

    // perímetro do trapézio
    public double perimetroTrapezio () {
        return baseMaior + baseMenor + ladoA + ladoB;
    }

    // perímetro do triângulo
    public double perimetroTriangulo () {
        return base + ladoA + ladoB;
    }

    // perímetro do círculo
    public double perimetroCirculo () {
        return 2 * Math.PI * raio;
    }
}
