import java.util.Scanner;

//16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde acordo com os 
//    seguintes critérios:
//    a) 50% para aqueles que ganham menos do que três salários mínimos;
//    b) 20% para aqueles que ganham entre três até dez salários mínimos;
//    c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//    d) 10% para os demais funcionários.

public class Ex16ReajusteSalarial {

    public static final double SALARIO_MINIMO = 1212.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int quantidadeFuncionarios = 584;
        int totalReajuste50 = 0;
        int totalReajuste20 = 0;
        int totalReajuste15 = 0;
        int totalReajuste10 = 0;

        // Loop para iterar sobre os funcionários
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.printf("Funcionário %d:\n", i + 1);

            // Leitura do salário do funcionário
            System.out.print("Salário atual: R$ ");
            double salarioAtual = scanner.nextDouble();

            // Cálculo do reajuste
            double valorReajuste = 0;
            if (salarioAtual < 3 * SALARIO_MINIMO) {
                valorReajuste = salarioAtual * 0.5;
                totalReajuste50++;
            } else if (salarioAtual < 10 * SALARIO_MINIMO) {
                valorReajuste = salarioAtual * 0.2;
                totalReajuste20++;
            } else if (salarioAtual < 20 * SALARIO_MINIMO) {
                valorReajuste = salarioAtual * 0.15;
                totalReajuste15++;
            } else {
                valorReajuste = salarioAtual * 0.1;
                totalReajuste10++;
            }

            // Exibição do novo salário
            double novoSalario = salarioAtual + valorReajuste;
            System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
            System.out.printf("Reajuste: R$ %.2f\n", valorReajuste);
        }

        // Exibição do resumo dos reajustes
        System.out.println("\nResumo dos Reajustes:");
        System.out.println("---------------------");
        System.out.printf("50%%: %d funcionários\n", totalReajuste50);
        System.out.printf("20%%: %d funcionários\n", totalReajuste20);
        System.out.printf("15%%: %d funcionários\n", totalReajuste15);
        System.out.printf("10%%: %d funcionários\n", totalReajuste10);
    }
}