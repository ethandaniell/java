package dio.ethan.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculoMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculoMediaDaTurma(String[] alunos, Scanner scanner) {
        
        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
