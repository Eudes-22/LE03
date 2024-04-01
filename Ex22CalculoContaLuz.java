import java.util.Scanner;

//

public class Ex22CalculoContaLuz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tipo de cliente
        System.out.print("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int tipoCliente = scanner.nextInt();

        // Leitura do consumo de energia
        System.out.print("Digite o consumo de energia (kWh): ");
        int consumoEnergia = scanner.nextInt();

        // Cálculo do valor do kWh
        double valorKWh = 0;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        // Cálculo do valor da conta
        double valorConta = valorKWh * consumoEnergia;

        // Exibição dos resultados
        System.out.printf("Valor do kWh: R$ %.2f\n", valorKWh);
        System.out.printf("Consumo de energia: %d kWh\n", consumoEnergia);
        System.out.printf("Valor da conta: R$ %.2f\n", valorConta);
    }
}
