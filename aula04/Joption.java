import javax.swing.*;
public class Joption {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String output = nome + " nome bosta ein!";
        JOptionPane.showMessageDialog(null, output);
    } 
}