package edu.pedro.primeirasemana.Operadores;

public class Operadores07 {
    public static void main(String [] args) {
        boolean condicao1 =true;

        boolean condicao2 =false;
        
        // ve se a condicao1 e 2 verdadeira
        if(condicao1 && condicao2){
            System.out.println("As Duas condições são verdadeiras");

        }
        // ve se a condicao1 e 7 e maior que 2 e veradeiro
        if(condicao1 && ( 7 > 2)){
            System.out.println("As Duas condições são verdadeiras");

        }

        // ve se alguma das condicao 1 e 2 e verdadeira
        if(condicao1 || condicao2){
            System.out.println("Umas das condições e verdadeiras");

        }
        

        System.out.println("FIM");


        


    }
    
}
