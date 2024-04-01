import java.util.Scanner;

//6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço 
//   de custo receberá um acréscimo de acordo com um percentual informado pelousuário.

public class Ex06CalculoPrecoVenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do preço de custo
        System.out.print("Preço de custo: R$ ");
        double precoCusto = scanner.nextDouble();

        // Leitura do percentual de acréscimo
        System.out.print("Percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();

        // Cálculo do valor do acréscimo
        double valorAcrescimo = precoCusto * percentualAcrescimo / 100;

        // Cálculo do preço de venda
        double precoVenda = precoCusto + valorAcrescimo;

        // Exibição do preço de venda
        System.out.printf("Preço de venda: R$ %.2f\n", precoVenda);
    }
}