import javax.swing.*;
public class CalcImc{
    public static void main(String[] args){
        String inputPeso = JOptionPane.showInputDialog("Qual o seu peso?");
        String inputAltura = JOptionPane.showInputDialog("Qual a sua altura?");
        float altura = Float.parseFloat(inputAltura); 
        float peso = Float.parseFloat(inputPeso);
        float imc = peso/(altura*altura); 

        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Magreza " );
        } else if(imc < 25){
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Normal " );
        } else if(imc < 30){
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Sobrepeso " );
        } else if(imc < 35){
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Obesidade Grau I " );
        } else if(imc < 40){
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Obesidade Grau II " );
        } else {
            JOptionPane.showMessageDialog(null, "O seu imc e : " + imc + "\nClassificacao: Obesidade Grau III " );
        }
    }
}