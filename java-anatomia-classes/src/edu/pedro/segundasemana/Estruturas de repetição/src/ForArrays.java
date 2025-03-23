public class ForArrays {
    public static void main(String[] args) {
        // Estrutura de arrays = Conjunto de elemento;
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

        // enquanto a variavel for menor que o length (tamanho) ele vai continuar a execução;
    for(int x=0; x < alunos.length; x++) {
        System.out.println("o aluno no indice x=" + x + " é "+ alunos[x]);
    }
    }
}
