package JavaEspec.src.com.alura.others.calculadoraPi;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        // Validação básica: lado deve ser positivo
        if (lado <= 0) {
            System.out.println("Valor inválido. O lado deve ser um número positivo.");
            scanner.close();
            return;
        }

        // Solicita e lê o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        // Validação básica: raio deve ser positivo
        if (raio <= 0) {
            System.out.println("Valor inválido. O raio deve ser um número positivo.");
            scanner.close();
            return;
        }

        // Calcula as áreas usando os métodos da classe CalculadoraArea
        double areaDoQuadrado = CalculadoraArea.calcularAreaQuadrado(lado);
        double areaDoCirculo = CalculadoraArea.calcularAreaCirculo(raio);

        // Imprime as áreas formatadas com 2 casas decimais
        System.out.printf("Área do quadrado: %.2f%n", areaDoQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaDoCirculo);

        // Fecha o Scanner
        scanner.close();
    }
}