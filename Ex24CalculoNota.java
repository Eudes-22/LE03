import java.util.Scanner;

public class Ex24CalculoNota {
    public static void main(String[] args) {
        double notaLaboratorio = 7.5;
        double notaAvaliacaoSemestral = 8.0;
        double notaExameFinal = 6.5;

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        System.out.println("A nota final do estudante é: " + notaFinal);
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        // Pesos das notas
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        // Calcula a média ponderada
        double mediaPonderada = (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);
        
        return mediaPonderada;
    }
}

