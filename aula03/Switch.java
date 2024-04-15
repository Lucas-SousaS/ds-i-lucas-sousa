import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Qual o dia da semana em numero?");
        int dia = Input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia Invalido");
        
        }
    }
}