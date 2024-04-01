import java.util.Scanner;

//20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programaque calcule e exiba
//    o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//    Professor Nível 1 R$12,00 por hora/aula
//    Professor Nível 2 R$17,00 por hora/aula
//    Professor Nível 3 R$25,00 por hora/aula

public class Ex20CalculoSalarioProfessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do professor
        System.out.print("Nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        // Leitura do nível do professor
        System.out.print("Nível do professor (1, 2 ou 3): ");
        int nivelProfessor = scanner.nextInt();

        // Leitura do número de horas/aula
        System.out.print("Número de horas/aula: ");
        int horasAula = scanner.nextInt();

        // Cálculo do valor da hora/aula
        double valorHoraAula = 0;
        switch (nivelProfessor) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido!");
                return;
        }

        // Cálculo do salário
        double salario = valorHoraAula * horasAula;

        // Exibição dos resultados
        System.out.println("\nNome do professor: " + nomeProfessor);
        System.out.printf("Valor da hora/aula: R$ %.2f\n", valorHoraAula);
        System.out.printf("Número de horas/aula: %d\n", horasAula);
        System.out.printf("Salário: R$ %.2f\n", salario);
    }
}
