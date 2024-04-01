import java.util.Scanner;

//11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se 
//    ela éhomem ou mulher. No final informe total de homens e de mulheres.

public class Ex11NomeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer do scanner

            if (sexo == 'M' || sexo == 'm') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.");
                i--; // decrementa o contador para repetir a entrada para esta pessoa
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}

