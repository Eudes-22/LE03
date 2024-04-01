import java.util.Scanner;

//8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
//   sua média (aritmética),informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e 
//   Recuperação (media entre 5.1 a 6.9).

public class Ex08CalculoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println("Menção: " + verificarMencao(media));
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public static String verificarMencao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media <= 5.0) {
            return "Reprovado";
        } else {
            return "Recuperação";

            
        }
    }
}
