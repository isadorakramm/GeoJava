package modelo;

public class GeometriaEspacial extends GeometriaPlana{

    private double altura, geratriz, faces;

    public void setPrisma (double faces, double base, double altura) {
        this.faces = faces;

        this.altura = altura;
    }
}
