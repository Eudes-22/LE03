import java.util.Scanner;

//19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo.
//    Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.
//    Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma doscomprimentos dos outros
//    dois lados.
//    Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
//    Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todotriângulo equilátero é também isóscele;
//    Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.

public class Ex19VerificacaoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos lados do triângulo
        System.out.print("Digite o valor do primeiro lado: ");
        int ladoA = scanner.nextInt();
        System.out.print("Digite o valor do segundo lado: ");
        int ladoB = scanner.nextInt();
        System.out.print("Digite o valor do terceiro lado: ");
        int ladoC = scanner.nextInt();

        // Verificação se os valores formam um triângulo
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            // Verificação do tipo de triângulo
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo equilátero!");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo isóscele!");
            } else {
                System.out.println("Triângulo escaleno!");
            }
        } else {
            System.out.println("Os valores não formam um triângulo!");
        }
    }
}
