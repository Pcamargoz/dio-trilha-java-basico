
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExceçõesAboutMe {
    public static void main(String[] args)  {
        // Analisando o bloco de codigo pra ver se tem algum erro 
        try{
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        // imprimindo os dados obtido pelo usuario 

        System.out.println("Ola, me chamo " + nome.toUpperCase() + sobrenome.toUpperCase());
        System.out.println("Tenho" + idade + "Anos");
        System.out.println("Minha altura é" + altura + "cm");

        scanner.close();

        }
        // especificando o erro 
        catch (InputMismatchException e){
            // mensagem pra caso apareca o erro acima 
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
        
    }
}
