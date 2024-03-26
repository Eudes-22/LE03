import java.util.Scanner;

// Classe principal do programa
public class Ex04ConvesorDolarReal {

    // Classe que representa a conversão de dólar para real
    static class Conversor {
        double cotacaoDolar;

        // Construtor para inicializar o valor da cotação do dólar
        public Conversor(double cotacaoDolar) {
            this.cotacaoDolar = cotacaoDolar;
        }

        // Método para calcular o valor em reais a partir de uma quantidade de dólares
        public double converterParaReal(double quantidadeDolares) {
            return quantidadeDolares * cotacaoDolar;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a cotação do dólar e a quantidade de dólares disponíveis
        System.out.println("Digite a cotação do dólar (em reais):");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolares = scanner.nextDouble();

        // Criar um objeto Conversor com a cotação do dólar fornecida
        Conversor conversor = new Conversor(cotacaoDolar);

        // Calcular o valor em reais a partir da quantidade de dólares
        double valorEmReais = conversor.converterParaReal(quantidadeDolares);

        // Exibir o valor convertido em reais
        System.out.println("\nValor em reais: R$" + valorEmReais);

        scanner.close();
    }
}

