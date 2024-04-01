import java.util.Scanner;

//14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se 
//    houve lucro, prejuízo ou empate para cada produto. Informe média de preço decusto e do preço de venda.

public class Ex14CustoLucro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrecoCusto = 0;
        double totalPrecoVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("Produto " + i + ":");
            System.out.println("Informe o preço de custo:");
            double precoCusto = scanner.nextDouble();

            System.out.println("Informe o preço de venda:");
            double precoVenda = scanner.nextDouble();

            totalPrecoCusto += precoCusto;
            totalPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaPrecoCusto = totalPrecoCusto / 40;
        double mediaPrecoVenda = totalPrecoVenda / 40;

        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
    }
}

