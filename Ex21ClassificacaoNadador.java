import java.util.Scanner;

//21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//    Infantil A = 5 - 7 anos
//    Infantil B = 8 - 10 anos
//    juvenil A = 11- 13 anos
//    juvenil B = 14 - 17 anos
//    Sênior = 18 - 25 anos 
//    Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

public class Ex21ClassificacaoNadador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade do nadador
        System.out.print("Digite a idade do nadador: ");
        int idadeNadador = scanner.nextInt();

        // Cálculo da categoria
        String categoria;
        switch (idadeNadador) {
            case 5:
            case 6:
            case 7:
                categoria = "Infantil A";
                break;
            case 8:
            case 9:
            case 10:
                categoria = "Infantil B";
                break;
            case 11:
            case 12:
            case 13:
                categoria = "Juvenil A";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                categoria = "Juvenil B";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                categoria = "Sênior";
                break;
            default:
                categoria = "Idade fora da faixa etária";
        }

        // Exibição da categoria
        System.out.println("Categoria: " + categoria);
    }
}
