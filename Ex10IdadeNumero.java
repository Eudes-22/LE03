import java.util.Scanner;

//10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de 
//    idade” e “menor de idade” para cada pessoa. Considerara pessoa com 18 anos como maior de idade.

public class Ex10IdadeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja verificar?");
        int numPessoas = scanner.nextInt();

        for (int i = 1; i <= numPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            verificarIdade(idade);
        }
    }

    public static void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}

