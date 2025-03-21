public class ResultadoEscolar {
    public static void main(String[] args) {
        // Nota 
        int nota = 10;

        // Se a nota for maior ou igual a 7 ele retorna Aprovado
        if(nota >= 7)
            System.out.println("Aprovado");

        // Vendo se a nota e maior ou igual a 5 E menor do que 7 
        else if (nota >= 5 && nota < 7) // Precisa me retornar true ou false
            System.out.println("Recuperação");

        // Se a nota for Nenhuma das duas e reprovado
        else
            System.out.println("Reprovado");
    }
}
