import java.util.Scanner;

public class IfElseTernario{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Qual o horario agora?");
        int tempo = Input.nextInt();
        String resultado;
        resultado = (tempo<18) ? "Bom Dia" : "Boa noite";
        System.out.println(resultado);
     }
}