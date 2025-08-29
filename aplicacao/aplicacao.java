import java.util.Scanner;

public class aplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometriaEspacial geometria = new GeometriaEspacial();

        System.out.println("Seja bem-vindo(a) ao programa de geometria!");
        System.out.println("Escolha o tipo de cálculo:");
        System.out.println("(1) Geometria Espacial");
        System.out.println("(2) Geometria Plana");
        System.out.print("Sua escolha: ");
        int tipoCalculo = scanner.nextInt();

        if (tipoCalculo == 1) {
            System.out.println("\nVocê escolheu Geometria Espacial.");
            System.out.println("Escolha a figura:");
            System.out.println("(1) Prisma");
            System.out.println("(2) Cilindro");
            System.out.println("(3) Pirâmide");
            System.out.println("(4) Cone");
            System.out.println("(5) Tronco do Cone");
            System.out.println("(6) Esfera");
            System.out.println("(7) Tronco da Pirâmide");
            System.out.print("Sua escolha: ");
            int figuraEspacial = scanner.nextInt();

            switch (figuraEspacial) {
                case 1: // Prisma
                    System.out.println("\nVocê escolheu Prisma.");
                    System.out.print("Digite a área da base: ");
                    double areaBasePrisma = scanner.nextDouble();
                    System.out.print("Digite o perímetro da base: ");
                    double perimetroBasePrisma = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaPrisma = scanner.nextDouble();
                    geometria.setPrisma(areaBasePrisma, perimetroBasePrisma, alturaPrisma);
                    System.out.println("Área Lateral do Prisma: " + geometria.areaLateralPrisma());
                    System.out.println("Volume do Prisma: " + geometria.volumePrisma());
                    break;
                case 2: // Cilindro
                    System.out.println("\nVocê escolheu Cilindro.");
                    System.out.print("Digite o raio: ");
                    double raioCilindro = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaCilindro = scanner.nextDouble();
                    geometria.setCilindro(raioCilindro, alturaCilindro);
                    System.out.println("Área Lateral do Cilindro: " + geometria.areaLateralCilindro());
                    System.out.println("Volume do Cilindro: " + geometria.volumeCilindro());
                    break;
                case 3: // Pirâmide
                    System.out.println("\nVocê escolheu Pirâmide.");
                    System.out.print("Digite a área da base: ");
                    double areaBasePiramide = scanner.nextDouble();
                    System.out.print("Digite o perímetro da base: ");
                    double perimetroBasePiramide = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaPiramide = scanner.nextDouble();
                    System.out.print("Digite a geratriz: ");
                    double geratrizPiramide = scanner.nextDouble();
                    geometria.setPiramide(areaBasePiramide, perimetroBasePiramide, alturaPiramide, geratrizPiramide);
                    System.out.println("Área Lateral da Pirâmide: " + geometria.areaLateralPiramide());
                    System.out.println("Volume da Pirâmide: " + geometria.volumePiramide());
                    break;
                case 4: // Cone
                    System.out.println("\nVocê escolheu Cone.");
                    System.out.print("Digite o raio: ");
                    double raioCone = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaCone = scanner.nextDouble();
                    System.out.print("Digite a geratriz: ");
                    double geratrizCone = scanner.nextDouble();
                    geometria.setCone(raioCone, alturaCone, geratrizCone);
                    System.out.println("Área Lateral do Cone: " + geometria.areaLateralCone());
                    System.out.println("Volume do Cone: " + geometria.volumeCone());
                    break;
                case 5: // Tronco do Cone
                    System.out.println("\nVocê escolheu Tronco do Cone.");
                    System.out.print("Digite o raio maior: ");
                    double raioMaiorTroncoCone = scanner.nextDouble();
                    System.out.print("Digite o raio menor: ");
                    double raioMenorTroncoCone = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaTroncoCone = scanner.nextDouble();
                    System.out.print("Digite a geratriz: ");
                    double geratrizTroncoCone = scanner.nextDouble();
                    geometria.setTroncoCone(raioMaiorTroncoCone, raioMenorTroncoCone, alturaTroncoCone, geratrizTroncoCone);
                    System.out.println("Área Lateral do Tronco do Cone: " + geometria.areaLateralTroncoCone());
                    System.out.println("Volume do Tronco do Cone: " + geometria.volumeTroncoCone());
                    break;
                case 6: // Esfera
                    System.out.println("\nVocê escolheu Esfera.");
                    System.out.print("Digite o raio: ");
                    double raioEsfera = scanner.nextDouble();
                    geometria.setEsfera(raioEsfera);
                    System.out.println("Área da Esfera: " + geometria.areaEsfera());
                    System.out.println("Volume da Esfera: " + geometria.volumeEsfera());
                    break;
                case 7: // Tronco da Pirâmide
                    System.out.println("\nVocê escolheu Tronco da Pirâmide.");
                    System.out.print("Digite a área da base maior: ");
                    double areaBaseMaiorTroncoPiramide = scanner.nextDouble();
                    System.out.print("Digite a área da base menor: ");
                    double areaBaseMenorTroncoPiramide = scanner.nextDouble();
                    System.out.print("Digite o perímetro da base maior: ");
                    double perimetroBaseMaiorTroncoPiramide = scanner.nextDouble();
                    System.out.print("Digite o perímetro da base menor: ");
                    double perimetroBaseMenorTroncoPiramide = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaTroncoPiramide = scanner.nextDouble();
                    System.out.print("Digite a apótema: ");
                    double apotemaTroncoPiramide = scanner.nextDouble();
                    geometria.setTroncoPiramide(areaBaseMaiorTroncoPiramide, areaBaseMenorTroncoPiramide, perimetroBaseMaiorTroncoPiramide, perimetroBaseMenorTroncoPiramide, alturaTroncoPiramide, apotemaTroncoPiramide);
                    System.out.println("Área Lateral do Tronco da Pirâmide: " + geometria.areaLateralTroncoPiramide());
                    System.out.println("Volume do Tronco da Pirâmide: " + geometria.volumeTroncoPiramide());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } else if (tipoCalculo == 2) {
            System.out.println("\nVocê escolheu Geometria Plana.");
            System.out.println("Escolha a figura:");
            System.out.println("(1) Quadrado");
            System.out.println("(2) Retângulo");
            System.out.println("(3) Triângulo");
            System.out.println("(4) Paralelogramo");
            System.out.println("(5) Losango");
            System.out.println("(6) Trapézio");
            System.out.println("(7) Círculo");
            System.out.print("Sua escolha: ");
            int figuraPlana = scanner.nextInt();
            GeometriaPlana geometriaPlana = new GeometriaPlana();

            switch (figuraPlana) {
                case 1: // Quadrado
                    System.out.println("\nVocê escolheu Quadrado.");
                    System.out.print("Digite o lado: ");
                    double ladoQuadrado = scanner.nextDouble();
                    geometriaPlana.setQuadrado(ladoQuadrado);
                    System.out.println("Área do Quadrado: " + geometriaPlana.areaQuadrado());
                    System.out.println("Perímetro do Quadrado: " + geometriaPlana.perimetroQuadrado());
                    break;
                case 2: // Retângulo
                    System.out.println("\nVocê escolheu Retângulo.");
                    System.out.print("Digite a base: ");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaRetangulo = scanner.nextDouble();
                    geometriaPlana.setRetangulo(baseRetangulo, alturaRetangulo);
                    System.out.println("Área do Retângulo: " + geometriaPlana.areaRetangulo());
                    System.out.println("Perímetro do Retângulo: " + geometriaPlana.perimetroRetangulo());
                    break;
                case 3: // Triângulo
                    System.out.println("\nVocê escolheu Triângulo.");
                    System.out.print("Digite a base: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaTriangulo = scanner.nextDouble();
                    geometriaPlana.setTriangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("Área do Triângulo: " + geometriaPlana.areaTriangulo());
                    System.out.println("Perímetro do Triângulo: (O cálculo requer os outros lados)");

                    break;
                case 4: // Paralelogramo
                    System.out.println("\nVocê escolheu Paralelogramo.");
                    System.out.print("Digite a base: ");
                    double baseParalelogramo = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaParalelogramo = scanner.nextDouble();
                    System.out.print("Digite o lado A: ");
                    double ladoAParalelogramo = scanner.nextDouble();
                    System.out.print("Digite o lado B: ");
                    double ladoBParalelogramo = scanner.nextDouble();
                    geometriaPlana.setParalelogramo(baseParalelogramo, alturaParalelogramo, ladoAParalelogramo, ladoBParalelogramo);
                    System.out.println("Área do Paralelogramo: " + geometriaPlana.areaParalelogramo());
                    System.out.println("Perímetro do Paralelogramo: " + geometriaPlana.perimetroParalelogramo());
                    break;
                case 5: // Losango
                    System.out.println("\nVocê escolheu Losango.");
                    System.out.print("Digite a diagonal maior: ");
                    double diagonalMaiorLosango = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor: ");
                    double diagonalMenorLosango = scanner.nextDouble();
                    System.out.print("Digite o lado: ");
                    double ladoLosango = scanner.nextDouble();
                    geometriaPlana.setLosango(diagonalMaiorLosango, diagonalMenorLosango, ladoLosango);
                    System.out.println("Área do Losango: " + geometriaPlana.areaLosango());
                    System.out.println("Perímetro do Losango: " + geometriaPlana.perimetroLosango());
                    break;
                case 6: // Trapézio
                    System.out.println("\nVocê escolheu Trapézio.");
                    System.out.print("Digite a base maior: ");
                    double baseMaiorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a base menor: ");
                    double baseMenorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double alturaTrapezio = scanner.nextDouble();
                    geometriaPlana.setTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);
                    System.out.println("Área do Trapézio: " + geometriaPlana.areaTrapezio());
                    System.out.println("Perímetro do Trapézio: (O cálculo requer os outros lados)");

                    break;
                case 7: // Círculo
                    System.out.println("\nVocê escolheu Círculo.");
                    System.out.print("Digite o raio: ");
                    double raioCirculo = scanner.nextDouble();
                    geometriaPlana.setCirculo(raioCirculo);
                    System.out.println("Área do Círculo: " + geometriaPlana.areaCirculo());
                    System.out.println("Perímetro do Círculo: " + geometriaPlana.perimetroCirculo());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } else {
            System.out.println("Opção de cálculo inválida.");
        }

        scanner.close();
    }
}