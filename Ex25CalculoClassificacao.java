import java.util.Scanner;



public class Ex25CalculoClassificacao {
        public static void main(String[] args) {
            String nomeEstudante = "João";
            int numeroMatricula = 123456;
            double notaLaboratorio = 7.5;
            double notaAvaliacaoSemestral = 8.0;
            double notaExameFinal = 6.5;
    
            double notaFinal = calcularNotaFinal(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
            char classificacao = calcularClassificacao(notaFinal);
    
            System.out.println("Nome do estudante: " + nomeEstudante);
            System.out.println("Número de matrícula: " + numeroMatricula);
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Classificação: " + classificacao);
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
    
        public static char calcularClassificacao(double notaFinal) {
            if (notaFinal >= 8 && notaFinal <= 10) {
                return 'A';
            } else if (notaFinal >= 7 && notaFinal < 8) {
                return 'B';
            } else if (notaFinal >= 6 && notaFinal < 7) {
                return 'C';
            } else if (notaFinal >= 5 && notaFinal < 6) {
                return 'D';
            } else {
                return 'R';
            }
        }
    }
       

