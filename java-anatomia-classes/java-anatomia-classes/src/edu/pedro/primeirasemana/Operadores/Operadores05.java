package edu.pedro.primeirasemana.Operadores;

public class Operadores05 {
    public static void main(String [] args){
        String nomeUm = "PEDRO";
       // String nomeDois = "PEDRO";

        // muda o valor da variavel e da o resultado false
        String nomeDois = new String ("PEDRO");

        //compara um valor de um objeto a outro.
        System.out.println(nomeUm.equals(nomeDois));

        // vendo se um nome e igual a outro 
        System.out.println(nomeUm == nomeDois);
        

        //variaveis com os numeros
        int numero1 = 1;
        int numero2 = 2;
        //numero 1 e igual a numero 2 ?
        boolean simNao = numero1 == numero2;
        // verificando se a condição e verdadeira
        if(numero1 < numero2) {
            System.out.println("A nossa condição e verdadeira");

        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        // numero1 diferente de numero2 ?
        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        // numero 1 e mairo doque numero 2 ?
        simNao = numero1 > numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

    }
    
}
