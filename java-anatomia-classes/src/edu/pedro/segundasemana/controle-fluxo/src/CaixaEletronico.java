public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("O seu novo saldo é de:" + saldo);
        
        }else

            System.out.println("Você não tem saldo o suficiente");
        

        
    }
    
}
