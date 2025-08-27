package modelo;

public class Geometria {
    public static void main(String[] args) {

        GeometriaEspacial minhaesfera = new GeometriaEspacial();

        minhaesfera.setEsfera(3); 
        double volumedaEsfera = minhaesfera.volumeEsfera();
        System.out.println("Volume da esfera: " + volumedaEsfera);

        GeometriaEspacial meuprisma = new GeometriaEspacial();
        meuprisma.setPrisma(9, 12, 5);
        double volumedoPrisma = meuprisma.volumePrisma();
        System.out.println("Volume do prisma: " + volumedoPrisma);
    }
}

