package aplicacao;
    
import modelo.*;

import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja bem-vindo(a) ao GeoJava!");
        System.out.println("Escolha um tipo de cálculo:");
        System.out.println("Geometria Espacial - 1");
        System.out.println("Geometria Plana - 2");
        System.out.println("----------------");
        
        int opcaoPrincipal = scanner.nextInt();
        
        if (opcaoPrincipal == 1) {
            menuGeometriaEspacial(scanner);
        } else if (opcaoPrincipal == 2) {
            menuGeometriaPlana(scanner);
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
    
    private static void menuGeometriaEspacial(Scanner scanner) {
        System.out.println("\nGeometria Espacial - Escolha a figura:");
        System.out.println("(1) Prisma");
        System.out.println("(2) Cilindro");
        System.out.println("(3) Pirâmide");
        System.out.println("(4) Cone");
        System.out.println("(5) Tronco");
        System.out.println("(6) Esfera");x
        System.out.println("----------------");
        
        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1:
                calcularPrisma(scanner);
                break;
            case 2:
                calcularCilindro(scanner);
                break;
            case 3:
                calcularPiramide(scanner);
                break;
            case 4:
                calcularCone(scanner);
                break;
            case 5:
                calcularTronco(scanner);
                break;
            case 6:
                calcularEsfera(scanner);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void menuGeometriaPlana(Scanner scanner) {
        System.out.println("\nGeometria Plana - Escolha a figura:");
        System.out.println("(1) Quadrado");
        System.out.println("(2) Retângulo");
        System.out.println("(3) Triângulo");
        System.out.println("(4) Paralelogramo");
        System.out.println("(5) Losango");
        System.out.println("(6) Trapézio");
        System.out.println("(7) Círculo");
        System.out.println("----------------");
        
        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1:
                calcularQuadrado(scanner);
                break;
            case 2:
                calcularRetangulo(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularParalelogramo(scanner);
                break;
            case 5:
                calcularLosango(scanner);
                break;
            case 6:
                calcularTrapezio(scanner);
                break;
            case 7:
                calcularCirculo(scanner);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    // Metodos para Geomtria Espacial
    private static void calcularPrisma(Scanner scanner) {
        System.out.println("\nCálculo do Prisma");
        System.out.print("Digite a área da base: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double volume = areaBase * altura;
        System.out.printf("Volume do prisma: %.2f\n", volume);
    }
    
    private static void calcularCilindro(Scanner scanner) {
        System.out.println("\nCálculo do Cilindro");
        System.out.print("Digite o raio da base: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = 2 * Math.PI * raio * (raio + altura);
        
        System.out.printf("Volume do cilindro: %.2f\n", volume);
        System.out.printf("Área lateral: %.2f\n", areaLateral);
        System.out.printf("Área total: %.2f\n", areaTotal);
    }
    
    private static void calcularPiramide(Scanner scanner) {
        System.out.println("\nCálculo da Pirâmide");
        System.out.print("Digite a área da base: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double volume = (areaBase * altura) / 3;
        System.out.printf("Volume da pirâmide: %.2f\n", volume);
    }
    
    private static void calcularCone(Scanner scanner) {
        System.out.println("\nCálculo do Cone");
        System.out.print("Digite o raio da base: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        double areaLateral = Math.PI * raio * geratriz;
        double areaTotal = Math.PI * raio * (raio + geratriz);
        
        System.out.printf("Volume do cone: %.2f\n", volume);
        System.out.printf("Área lateral: %.2f\n", areaLateral);
        System.out.printf("Área total: %.2f\n", areaTotal);
    }
    
    private static void calcularTronco(Scanner scanner) {
        System.out.println("\nCálculo do Tronco de Cone/Pirâmide");
        System.out.println("1 - Tronco de Cone");
        System.out.println("2 - Tronco de Pirâmide");
        int tipo = scanner.nextInt();
        
        if (tipo == 1) {
            System.out.print("Digite o raio maior: ");
            double raioMaior = scanner.nextDouble();
            System.out.print("Digite o raio menor: ");
            double raioMenor = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            
            double volume = (Math.PI * altura * (Math.pow(raioMaior, 2) + raioMaior * raioMenor + Math.pow(raioMenor, 2))) / 3;
            System.out.printf("Volume do tronco de cone: %.2f\n", volume);
        } else if (tipo == 2) {
            System.out.print("Digite a área da base maior: ");
            double areaBaseMaior = scanner.nextDouble();
            System.out.print("Digite a área da base menor: ");
            double areaBaseMenor = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            
            double volume = (altura * (areaBaseMaior + areaBaseMenor + Math.sqrt(areaBaseMaior * areaBaseMenor))) / 3;
            System.out.printf("Volume do tronco de pirâmide: %.2f\n", volume);
        }
    }
    
    private static void calcularEsfera(Scanner scanner) {
        System.out.println("\nCálculo da Esfera");
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        double area = 4 * Math.PI * Math.pow(raio, 2);
        
        System.out.printf("Volume da esfera: %.2f\n", volume);
        System.out.printf("Área da superfície: %.2f\n", area);
    }
    
    // Metodos para Geometria Plana
    private static void calcularQuadrado(Scanner scanner) {
        System.out.println("\nCálculo do Quadrado");
        System.out.print("Digite o lado: ");
        double lado = scanner.nextDouble();
        
        double area = Math.pow(lado, 2);
        double perimetro = 4 * lado;
        
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }
    
    private static void calcularRetangulo(Scanner scanner) {
        System.out.println("\nCálculo do Retângulo");
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }
    
    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("\nCálculo do Triângulo");
        System.out.println("1 - Triângulo qualquer (base e altura)");
        System.out.println("2 - Triângulo retângulo");
        System.out.println("3 - Triângulo equilátero");
        int tipo = scanner.nextInt();
        
        if (tipo == 1) {
            System.out.print("Digite a base: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            
            double area = (base * altura) / 2;
            System.out.printf("Área: %.2f\n", area);
        } else if (tipo == 2) {
            System.out.print("Digite o cateto 1: ");
            double cateto1 = scanner.nextDouble();
            System.out.print("Digite o cateto 2: ");
            double cateto2 = scanner.nextDouble();
            
            double area = (cateto1 * cateto2) / 2;
            double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            double perimetro = cateto1 + cateto2 + hipotenusa;
            
            System.out.printf("Área: %.2f\n", area);
            System.out.printf("Perímetro: %.2f\n", perimetro);
            System.out.printf("Hipotenusa: %.2f\n", hipotenusa);
        } else if (tipo == 3) {
            System.out.print("Digite o lado: ");
            double lado = scanner.nextDouble();
            
            double area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
            double perimetro = 3 * lado;
            
            System.out.printf("Área: %.2f\n", area);
            System.out.printf("Perímetro: %.2f\n", perimetro);
        }
    }
    
    private static void calcularParalelogramo(Scanner scanner) {
        System.out.println("\nCálculo do Paralelogramo");
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        System.out.printf("Área: %.2f\n", area);
    }
    
    private static void calcularLosango(Scanner scanner) {
        System.out.println("\nCálculo do Losango");
        System.out.print("Digite a diagonal maior: ");
        double diagMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor: ");
        double diagMenor = scanner.nextDouble();
        
        double area = (diagMaior * diagMenor) / 2;
        double lado = Math.sqrt(Math.pow(diagMaior/2, 2) + Math.pow(diagMenor/2, 2));
        double perimetro = 4 * lado;
        
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }
    
    private static void calcularTrapezio(Scanner scanner) {
        System.out.println("\nCálculo do Trapézio");
        System.out.print("Digite a base maior: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite a base menor: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("Área: %.2f\n", area);
    }
    
    private static void calcularCirculo(Scanner scanner) {
        System.out.println("\nCálculo do Círculo");
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro (circunferência): %.2f\n", perimetro);
    }
}