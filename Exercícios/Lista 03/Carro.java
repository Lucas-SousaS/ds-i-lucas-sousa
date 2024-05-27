
public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private boolean motorLigado;
    private int velocidade;
    private int marcha;
    private int cambio;


    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.nome = "doblo";
        carro1.marca = "fiat";
        carro1.ano = 2015;
        carro1.motorLigado = false;
        carro1.velocidade = 0;  
        carro1.marcha = 0;
        carro1.cambio = 6;

        carro1.ligarCarro();
        carro1.trocarMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.frear();
    }

    public void acelerar(){
        if(motorLigado == false){
            System.out.println("Ligue o carro primeiro para acelerar");
        } else if(marcha == 0) {
            System.out.println("O carro morreu, você não trocou a marcha");
            motorLigado = false;
        } else if(marcha > 1){
            System.out.println("você tentou sair com a marcha muito alta e o carro morreu");
            motorLigado = false;
        } else{
            velocidade += 1;
            System.out.println("a velocidade do seu carro é: " + velocidade);
        }
    }

    public void frear(){
        if(velocidade == 0){
            System.out.println("O carro já esta parado!");
        } else{
            velocidade -= 1;
            System.out.println("a velocidade diminuiu e agora é: " + velocidade);
        }
    }

    public void ligarCarro(){
        if(motorLigado == true){
            System.out.println("o motor já está ligado");
        } else{
            motorLigado = true;
            System.out.println("você ligou o carro");
        }
    }

    public void trocarMarcha(){
        if(marcha == cambio){
            System.out.println("Já está na ultima marcha");
        } else {
            marcha += 1;
            System.out.println("Trocou de marcha");
        }
    }

    
}