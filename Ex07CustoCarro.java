import java.util.Scanner;

//7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos 
//   impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor 
//   sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um 
//   programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

public class Ex07CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double custoConsumidor = calcularCustoConsumidor(custoFabrica);

        System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);
    }

    public static double calcularCustoConsumidor(double custoFabrica) {
        double impostos = custoFabrica * 0.45;
        double custoDistribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + custoDistribuidor;
    }
}





