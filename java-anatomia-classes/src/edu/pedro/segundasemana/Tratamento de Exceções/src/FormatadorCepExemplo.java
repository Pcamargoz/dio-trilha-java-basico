public class FormatadorCepExemplo {
    public static void main(String[] args) {
        // tratando usando try
        try {
            String cepFormatado = formatarcep("23765064 ");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com a regras de negocio");
        }
    }
    // tratando sem try
    static String formatarcep(String cep) throws CepInvalidoException{

        // length esta contando quanto a variavel cep tem de caracteres;
        if(cep.length() != 8)
        throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
