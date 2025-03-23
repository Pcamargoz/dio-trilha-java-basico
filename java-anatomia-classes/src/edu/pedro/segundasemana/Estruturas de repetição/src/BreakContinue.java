public class BreakContinue {
    public static void main(String[] args) {
        // BREAK = quebrar, parar, frear, interromper
        // CONTINUE = continua, interrompe somente a interação atual 
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            System.out.println(numero);
        }
    }
}
