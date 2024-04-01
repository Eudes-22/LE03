import java.util.Scanner;

//13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou 
//    não para cumprir o serviço militar obrigatório. Informe os totais.
 
public class Ex13DadosMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja verificar?");
        int totalPessoas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        int aptos = 0;
        int naoAptos = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.nextLine().charAt(0);

            System.out.println("Informe a idade da pessoa:");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.println("Informe o estado de saúde da pessoa (S para saudável, N para não saudável):");
            char saude = scanner.nextLine().charAt(0);

            if ((sexo == 'M' || sexo == 'm') && idade >= 18 && saude == 'S' || saude == 's') {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                aptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                naoAptos++;
            }
        }

        System.out.println("Total de pessoas aptas: " + aptos);
        System.out.println("Total de pessoas não aptas: " + naoAptos);
    }
}

