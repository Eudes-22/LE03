import java.util.Scanner;

//17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado.
//    Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto àempresa vai aumentar sua 
//    folha de pagamento.

public class Ex17CalculoNovoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do funcionário
        System.out.print("Nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        // Leitura do salário atual
        System.out.print("Salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Leitura do valor do salário mínimo
        System.out.print("Valor do salário mínimo: R$ ");
        double valorSalarioMinimo = scanner.nextDouble();

        // Cálculo do reajuste
        double reajuste = salarioAtual * (valorSalarioMinimo / 100);

        // Cálculo do novo salário
        double novoSalario = salarioAtual + reajuste;

        // Exibição dos resultados
        System.out.println("\nNome do funcionário: " + nomeFuncionario);
        System.out.printf("Reajuste: R$ %.2f\n", reajuste);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
    }
}

