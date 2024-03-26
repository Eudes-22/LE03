import java.util.Scanner;

// Classe principal do programa
public class Ex05lojaMamao {

    // Classe que representa a compra e o cálculo das prestações
    static class Compra {
        double valorCompra;

        // Construtor para inicializar o valor da compra
        public Compra(double valorCompra) {
            this.valorCompra = valorCompra;
        }

        // Método para calcular e retornar o valor de cada prestação
        public double calcularPrestacoes() {
            // Dividir o valor total da compra pelo número de prestações (5)
            return valorCompra / 5;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da compra ao usuário
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        // Criar um objeto Compra com o valor fornecido
        Compra compra = new Compra(valorCompra);

        // Calcular o valor de cada prestação
        double valorPrestacao = compra.calcularPrestacoes();

        // Exibir o valor de cada prestação
        System.out.println("\nValor de cada prestação: R$" + valorPrestacao);

        scanner.close();
    }
}

