import java.util.Scanner;

//12.A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um programa 
//   que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá 
//   ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar 
//   se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano 
//   até 2000 e total geral.

public class Ex12CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        do {
            System.out.println("Informe o ano do veículo:");
            int anoVeiculo = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            double desconto;
            if (anoVeiculo <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            double valorCarro = 10000; // Supondo um valor base de R$ 10.000
            double valorDesconto = valorCarro * desconto;
            double valorFinal = valorCarro - valorDesconto;

            System.out.println("Desconto: R$ " + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$ " + valorFinal);

            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.nextLine().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros calculados: " + totalGeral);
    }
}

