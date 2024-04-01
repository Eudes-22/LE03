import java.util.Scanner;

//15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Façaum programa que 
//    calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O descontodeverá ser calculado sobre o
//    valor do veículo de acordo com o combustível (álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do 
//    veículo zero encerra entrada de dados.Informe total dedesconto e total pago pelos clientes.

public class Ex15ConcessionariaCarango {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        double totalDesconto = 0;
        double totalPago = 0;

        // Loop para iterar sobre os veículos
        while (true) {
            System.out.println("---------------------");
            System.out.println("Novo Veículo");
            System.out.println("---------------------");

            // Leitura do valor do veículo
            System.out.print("Valor do veículo: R$ ");
            double valorVeiculo = scanner.nextDouble();

            // Se valor do veículo for zero, encerra a entrada de dados
            if (valorVeiculo == 0) {
                break;
            }

            // Leitura do tipo de combustível
            System.out.print("Tipo de combustível (A/G/D): ");
            String tipoCombustivel = scanner.next().toUpperCase();

            // Cálculo do desconto
            double desconto = 0;
            switch (tipoCombustivel) {
                case "A":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "G":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "D":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido!");
                    continue;
            }

            // Cálculo do valor a ser pago
            double valorPago = valorVeiculo - desconto;

            // Exibição do desconto e valor a ser pago
            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);

            // Acumulação do total de desconto e total pago
            totalDesconto += desconto;
            totalPago += valorPago;
        }

        // Exibição do resumo das vendas
        System.out.println("\nResumo das Vendas:");
        System.out.println("---------------------");
        System.out.printf("Total de desconto: R$ %.2f\n", totalDesconto);
        System.out.printf("Total pago: R$ %.2f\n", totalPago);
    }
}