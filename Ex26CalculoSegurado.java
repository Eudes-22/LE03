import java.util.Scanner;


public class Ex26CalculoSegurado {
    public static void main(String[] args) {
        String nomePretendente = "João";
        int idade = 25;
        int grupoRisco = 3;

        String categoria = determinarCategoriaSeguro(idade, grupoRisco);

        if (categoria != null) {
            System.out.println("Nome: " + nomePretendente);
            System.out.println("Idade: " + idade);
            System.out.println("Grupo de risco: " + grupoRisco);
            System.out.println("Categoria de seguro: " + categoria);
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }
    }

    public static String determinarCategoriaSeguro(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                default:
                    return null;
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                default:
                    return null;
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                default:
                    return null;
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case 4:
                    return "4";
                case 5:
                    return "5";
                default:
                    return null;
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                default:
                    return null;
            }
        } else {
            return null;
        }
    }
}