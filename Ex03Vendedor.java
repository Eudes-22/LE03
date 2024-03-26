import java.util.Scanner;

//3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
//   efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas 
//   vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.

// Classe principal do programa
public class Ex03Vendedor {


    // Classe que representa um vendedor
    static class Vendedor {
        String nome;
        double salarioFixo;
        double totalVendas;

        // Construtor para inicializar os atributos
        public Vendedor(String nome, double salarioFixo, double totalVendas) {
            this.nome = nome;
            this.salarioFixo = salarioFixo;
            this.totalVendas = totalVendas;
        }

        // Método para calcular o salário final do vendedor
        public double calcularSalarioFinal() {
            // 15% de comissão sobre as vendas
            double comissao = totalVendas * 0.15;
            // Salário final é a soma do salário fixo e da comissão
            return salarioFixo + comissao;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do vendedor
        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor:");
        double totalVendas = scanner.nextDouble();

        // Criar um objeto Vendedor com as informações fornecidas
        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

        // Calcular o salário final do vendedor
        double salarioFinal = vendedor.calcularSalarioFinal();

        // Exibir os resultados
        System.out.println("\nInformações do vendedor:");
        System.out.println("Nome: " + vendedor.nome);
        System.out.println("Salário Fixo: R$" + vendedor.salarioFixo);
        System.out.println("Salário Final: R$" + salarioFinal);

        scanner.close();
    }
}





