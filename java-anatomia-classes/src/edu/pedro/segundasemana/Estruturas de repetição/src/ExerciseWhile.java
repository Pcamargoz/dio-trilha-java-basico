import java.util.concurrent.ThreadLocalRandom;

public class ExerciseWhile {
    public static void main(String[] args) {

        // Dinheiro disponivel 
        double saldo = 100.0;

        // Enquanto o saldo for maior que 0 ele "Adiciona" combo , para depois fazer a subtração do combo pelo saldo 
        while( saldo > 0) {
            double Combo = valorAleatorio();

            // SEGURANÇA PARA NÃO FICAR REVISANDO O CODIGO 
            if(Combo > saldo)
                Combo= saldo;
                
            System.out.println("Você Desceu um combo de: " + Combo + " Adicionado no carrinho");
            saldo = saldo - Combo;

        }
        System.out.println("Seu saldo: " + saldo);
        System.out.println("Você quebrou a casa irmão !!!!");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(10, 20);
}
}
