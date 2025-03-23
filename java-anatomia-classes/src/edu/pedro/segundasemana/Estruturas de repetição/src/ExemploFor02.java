public class ExemploFor02 {
    public static void main(String[] args) {
        // em arrays o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };
        
        // os dois pontos serve que para a cada interação de aluno o indice atual vai atualizar a variavel (obtendo um novo valor);
        // ALUNO criando outra variavel;
        for(String aluno : alunos) {
            System.out.println("O nome do aluno e " + aluno);

        }
    }
}
