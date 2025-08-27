package modelo;

public class GeometriaEspacial extends GeometriaPlana{

    private double altura, geratriz, raio, raioMaior, raioMenor, areaBase, areaBaseMaior, areaBaseMenor, perimetroBase, perimetroBaseMaior, perimetroBaseMenor, apotema;

    public void setPrisma(double areaBase, double perimetroBase, double altura) {
        this.areaBase = areaBase;
        this.perimetroBase = perimetroBase;
        this.altura = altura;
    }

    public double areaLateralPrisma() {
        return perimetroBase * altura;
    }

    public double volumePrisma() {
        return areaBase * altura;
    }

    public void setCilindro(double raio, double altura) {
        setCirculo(raio); 
        this.altura = altura;
    }

    public double areaLateralCilindro() {
        return perimetroCirculo() * altura;
    }

    public double volumeCilindro() {
        return areaCirculo() * altura;
    }

    // piramide
    public void setPiramide(double areaBase, double perimetroBase, double altura, double geratriz) {
        this.areaBase = areaBase;
        this.perimetroBase = perimetroBase;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    public double areaLateralPiramide() {
        return (perimetroBase * geratriz) / 2;
    }

    public double volumePiramide() {
        return (areaBase * altura) / 3;
    }

    // esfera
    public void setEsfera(double raio) {
        this.raio = raio;
    }

    public double areaEsfera() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public double volumeEsfera() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // cone
    public void setCone(double raio, double altura, double geratriz) {
        this.raio = raio;
        setCirculo(raio);
        this.altura = altura;
        this.geratriz = geratriz;
    }

    public double areaLateralCone() {
        return Math.PI * raio * geratriz;
    }

    public double volumeCone() {
        return (areaCirculo() * altura) / 3;
    }

    // tronco de cone
    public void setTroncoCone(double raioMaior, double raioMenor, double altura, double geratriz) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    public double areaLateralTroncoCone() {
        return Math.PI * geratriz * (raioMaior + raioMenor);
    }

    public double volumeTroncoCone() {
        return (Math.PI * altura / 3) * (Math.pow(raioMaior, 2) + raioMaior * raioMenor + Math.pow(raioMenor, 2));
    }

    // tronco de piramide
    public void setTroncoPiramide(double areaBaseMaior, double areaBaseMenor, double perimetroBaseMaior,
            double perimetroBaseMenor, double altura, double apotema) {
        this.areaBaseMaior = areaBaseMaior;
        this.areaBaseMenor = areaBaseMenor;
        this.perimetroBaseMaior = perimetroBaseMaior;
        this.perimetroBaseMenor = perimetroBaseMenor;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double areaLateralTroncoPiramide() {
        return ((perimetroBaseMaior + perimetroBaseMenor) / 2) * apotema;
    }

    public double volumeTroncoPiramide() {
        return (altura / 3.0) * (areaBaseMaior + Math.sqrt(areaBaseMaior * areaBaseMenor) + areaBaseMenor);
    }
}
