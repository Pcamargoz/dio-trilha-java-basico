public class ResultadoEscolar2 {
    public static void main(String[] args) {

        // Nota
        int nota = 6;

        // criando uma variavel direta aonde SE NOTA E MAIOR OU IGUAL A 7 "Aprovado" SE NÃO "Reprovado"
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        // Ve se a nota e maior ou igual a 7, se nao nota maior ou igual e 5 E menor que 7, e se não;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
