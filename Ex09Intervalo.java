import java.util.Scanner;

//9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo 
//   entre 10 (inclusive)e 150 (inclusive).

public class Ex09Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 80 números:");
        for (int i = 0; i < 80; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 150]: " + contador);
    }
}

