public class BreakContinue02 {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
            // CONTINUE = Pula a interação que você deseja
                continue;
            System.out.println(numero);
        }
    }
}
