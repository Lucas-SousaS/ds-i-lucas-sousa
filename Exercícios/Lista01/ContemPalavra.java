import java.util.Scanner;

public class ContemPalavra {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);


        System.out.println("Qual a frase?");
        String frase = Input.nextLine();

        System.out.println("\nQual a palavra que voce quer saber se tem na frase");
        String palavra = Input.nextLine(); 

        boolean resultado = frase.contains(palavra);

        if (resultado == true){
            System.out.println("A frase: '" + frase + "';\nContem a palavra: " + palavra);
        } else {
            System.out.println("A frase: '" + frase + "';\nNao contem palavra: " + palavra);
        }

    }
}