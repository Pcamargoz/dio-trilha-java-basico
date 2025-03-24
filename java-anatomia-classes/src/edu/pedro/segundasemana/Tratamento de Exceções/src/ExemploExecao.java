
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExecao {
    public static void main(String[] args) {
        Number valor;
        
        // Tentando;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

            // catch para caso o problema especificado aparecer;
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("Esta tentando formatar o numero pra você");
        }
    }
}
