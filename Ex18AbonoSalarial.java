import java.util.Scanner;

//18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostreo nome e o 
//    salário líquido acrescido do abono conforme o sexo e a idade:
//    Sexo Idade Abono
//    M    >= 30  100,00
//         < 30   50,00
//    F    >= 30  200,00
//         < 30   80,00

public class Ex18AbonoSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do funcionário
        System.out.print("Nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        // Leitura da idade do funcionário
        System.out.print("Idade do funcionário: ");
        int idadeFuncionario = scanner.nextInt();

        // Leitura do sexo do funcionário
        System.out.print("Sexo do funcionário (M/F): ");
        String sexoFuncionario = scanner.next().toUpperCase();

        // Leitura do salário fixo do funcionário
        System.out.print("Salário fixo do funcionário: R$ ");
        double salarioFixo = scanner.nextDouble();

        // Cálculo do abono
        double abono = 0;
        if (sexoFuncionario.equals("M")) {
            if (idadeFuncionario >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else if (sexoFuncionario.equals("F")) {
            if (idadeFuncionario >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }

        // Cálculo do salário líquido
        double salarioLiquido = salarioFixo + abono;

        // Exibição dos resultados
        System.out.println("\nNome do funcionário: " + nomeFuncionario);
        System.out.printf("Abono: R$ %.2f\n", abono);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
    }
}
