package dio.ethan.estruturasrepeticao;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        //outra maneira de interagir 
        /*
         * for(String aluno : alunos) {
         *     System.out.println("Nome do aluno é: " + alun0);
         * }
         */
    }
}
