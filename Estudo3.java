import java.util.Scanner;
public class Estudo3 {
    //Programa simples com While loop para fazer uma contagem de 1 a 10 para um jogo de pique esconde.
    //Programa sera feito utilizando metodos e objetos.
    static int i;
    static void Contagem(){
        System.out.println("Comece a contar! ");
        Scanner Contagem = new Scanner(System.in); //Criacao do scanner
        while(Contagem.hasNextInt() == true){
            String Final = Contagem.next();
            System.out.println(Final); // Apenas para que haja o print.
            if (Final.equals("Prontos ou nao ai vou eu!")) { //Codigo para quebrar o programa e nao ficar em loop infinito
                break;
            } 
        }
    }
    public static void main(String[] args){
        Contagem();
    }
}

