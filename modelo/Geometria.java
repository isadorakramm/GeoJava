package modelo;

public class Geometria {
    private static final GeometriaEspacial geoEs = new GeometriaEspacial();
    private static final GeometriaPlana geoPla = new GeometriaPlana();

    // quadrado

    public static double areaQuadrado(double lado) {
        geoPla.setQuadrado(lado);
        return geoPla.areaQuadrado();
    }

    public static double perimetroQuadrado(double lado) {
        geoPla.setQuadrado(lado);
        return geoPla.perimetroQuadrado();
    }

    // retângulo

    public static double areaRetangulo(double base, double altura) {
        geoPla.setRetangulo(base, altura);
        return geoPla.areaRetangulo();
    }

    public static double perimetroRetangulo(double base, double altura) {
        geoPla.setRetangulo(base, altura);
        return geoPla.perimetroRetangulo();
    }

    // paralelogramo

    public static double areaParalelogramo(double base, double altura) {
        geoPla.setParalelogramo(base, altura, 0, 0);
        return geoPla.areaParalelogramo();
    }

    public static double perimetroParalelogramo(double ladoA, double ladoB) {
        return geoPla.perimetroParalelogramo();
    }

    // losango

    public static double areaLosango(double diagonalMaior, double diagonalMenor) {
        geoPla.setLosango(diagonalMaior, diagonalMenor, 0);
        return geoPla.areaLosango();
    }

    public static double perimetroLosango(double lado) {
        geoPla.setLosango(0, 0, lado);
        return geoPla.perimetroLosango();
    }

    // trapézio

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        geoPla.setTrapezio(baseMaior, baseMenor, altura);
        return geoPla.areaTrapezio();
    }

    public static double perimetroTrapezio(double baseMaior, double baseMenor, double ladoA, double ladoB) {
        return baseMaior + baseMenor + ladoA + ladoB;
    }

    // triãngulo

    public static double areaTriangulo(double base, double altura) {
        geoPla.setTriangulo(base, altura);
        return geoPla.areaTriangulo();
    }

    public static double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    // circulo

   public static double areaCirculo(double raio) {
        geoPla.setCirculo(raio);
        return geoPla.areaCirculo();
    }

    public static double perimetroCirculo(double raio) {
        geoPla.setCirculo(raio);
        return geoPla.perimetroCirculo();
    }

    // prisma

    public static double calcularAreaLateralPrisma(double perimetroBase, double altura) {
        geoEs.setPrisma(0, perimetroBase, altura); 
        return geoEs.areaLateralPrisma();
    }
    public static double calcularVolumePrisma(double areaBase, double altura) {
        geoEs.setPrisma(areaBase, 0, altura); 
        return geoEs.volumePrisma();
    }

    // cilindro

    public static double calcularAreaLateralCilindro(double raio, double altura) {
        geoEs.setCilindro(raio, altura); 
        return geoEs.areaLateralCilindro();
    }
    public static double calcularVolumeCilindro(double raio, double altura) {
        geoEs.setCilindro(raio, altura); 
        return geoEs.volumeCilindro();
    }

    // pirâmide

    public static double calcularAreaLateralPiramide(double perimetroBase, double geratriz) {
        geoEs.setPiramide(0, perimetroBase, 0, geratriz);
        return geoEs.areaLateralPiramide();
    }

    public static double calcularVolumePiramide(double areaBase, double altura) {
        geoEs.setPiramide(areaBase, 0, altura, 0);
        return geoEs.volumePiramide();
    }

    // esfera

    public static double calcularAreaEsfera(double raio) {
        geoEs.setEsfera(raio);
        return geoEs.areaEsfera();
    }

    public static double calcularVolumeEsfera(double raio) {
        geoEs.setEsfera(raio);
        return geoEs.volumeEsfera();
    }

    // cone

    public static double calcularAreaLateralCone(double raio, double geratriz) {
        geoEs.setCone(raio, 0, geratriz);
        return geoEs.areaLateralCone();
    }

    public static double calcularVolumeCone(double raio, double altura) {
        geoEs.setCone(raio, altura, 0);
        return geoEs.volumeCone();
    }

    // tronco do cone

    public static double calcularAreaLateralTroncoCone(double raioMaior, double raioMenor, double geratriz) {
        geoEs.setTroncoCone(raioMaior, raioMenor, 0, geratriz);
        return geoEs.areaLateralTroncoCone();
    }

    public static double calcularVolumeTroncoCone(double raioMaior, double raioMenor, double altura) {
        geoEs.setTroncoCone(raioMaior, raioMenor, altura, 0);
        return geoEs.volumeTroncoCone();
    }

    // tronco da pirâmide

    public static double calcularAreaLateralTroncoPiramide(double perimetroBaseMaior, double perimetroBaseMenor, double apotema) {
        geoEs.setTroncoPiramide(0, 0, perimetroBaseMaior, perimetroBaseMenor, 0, apotema);
        return geoEs.areaLateralTroncoPiramide();
    }

    public static double calcularVolumeTroncoPiramide(double areaBaseMaior, double areaBaseMenor, double altura) {
        geoEs.setTroncoPiramide(areaBaseMaior, areaBaseMenor, 0, 0, altura, 0);
        return geoEs.volumeTroncoPiramide();
    }

}

