import java.util.Scanner;

public class Ex23CalculoPesoIdeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();

        // Leitura do sexo da pessoa
        System.out.print("Digite o sexo da pessoa (M/F): ");
        String sexoPessoa = scanner.next().toUpperCase();

        // Leitura da altura da pessoa
        System.out.print("Digite a altura da pessoa (em metros): ");
        double alturaPessoa = scanner.nextDouble();

        // Leitura da idade da pessoa
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();

        // Cálculo do peso ideal
        double pesoIdeal = 0;
        if (sexoPessoa.equals("M")) {
            if (alturaPessoa > 1.70) {
                if (idadePessoa <= 20) {
                    pesoIdeal = (72.7 * alturaPessoa) - 58;
                } else if (idadePessoa <= 39) {
                    pesoIdeal = (72.7 * alturaPessoa) - 53;
                } else {
                    pesoIdeal = (72.7 * alturaPessoa) - 45;
                }
            } else {
                if (idadePessoa <= 40) {
                    pesoIdeal = (72.7 * alturaPessoa) - 50;
                } else {
                    pesoIdeal = (72.7 * alturaPessoa) - 58;
                }
            }
        } else if (sexoPessoa.equals("F")) {
            if (alturaPessoa > 1.50) {
                pesoIdeal = (62.1 * alturaPessoa) - 44.7;
            } else {
                if (idadePessoa >= 35) {
                    pesoIdeal = (62.1 * alturaPessoa) - 45;
                } else {
                    pesoIdeal = (62.1 * alturaPessoa) - 49;
                }
            }
        }

        // Exibição dos resultados
        System.out.println("\nNome da pessoa: " + nomePessoa);
        System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
    }
}
