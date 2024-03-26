import java.util.Scanner;

// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância
//    total percorrida pelo automóvel e o total de combustível gasto.

// Classe principal do programa
public class Ex02ConsumoMedio {

    // Classe que representa um automóvel
    static class Automovel {
        double distanciaPercorrida;
        double combustivelGasto;

        // Construtor para inicializar os atributos
        public Automovel(double distanciaPercorrida, double combustivelGasto) {
            this.distanciaPercorrida = distanciaPercorrida;
            this.combustivelGasto = combustivelGasto;
        }

        // Método para calcular o consumo médio do automóvel
        public double calcularConsumoMedio() {
            // Consumo médio = Distância total percorrida / Total de combustível gasto
            return distanciaPercorrida / combustivelGasto;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do automóvel
        System.out.println("Digite a distância total percorrida pelo automóvel:");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto pelo automóvel:");
        double combustivelGasto = scanner.nextDouble();

        // Criar um objeto Automovel com as informações fornecidas
        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);

        // Calcular o consumo médio do automóvel
        double consumoMedio = automovel.calcularConsumoMedio();

        // Exibir o consumo médio
        System.out.println("\nConsumo médio do automóvel: " + consumoMedio + " km/l");

        scanner.close();
    }
}
