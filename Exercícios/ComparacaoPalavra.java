import java.util.Scanner;

public class ComparacaoPalavra {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("\nComparador de Palavras: \n\n");

        System.out.println("Digite a primeira palavra:");
        String palavra1 = Input.nextLine();

        System.out.println("\nDigite a segunda palavra:");
        String palavra2 = Input.nextLine(); 

        int resultado = palavra1.compareTo(palavra2);

        if (resultado == 0){
            System.out.println("A palavra: " + palavra1 + " e igual a palavra: " + palavra2);
        } else {
            System.out.println("A palavra: " + palavra1 + " e diferente da palavra: " + palavra2);
        }

    }
}