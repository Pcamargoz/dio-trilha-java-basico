import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do { 
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
            // Se atendeu vai dizer alô
        } while (tocando());

        System.out.println("Alô !!!");

    }
    private static boolean tocando(){
        // Radom um numero de 0 a 2 e se for 1 ele gera true e o ! transforma em false para o loop
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);
        // Negando o ato de continuar tocando
        return  ! atendeu;
    }

}
