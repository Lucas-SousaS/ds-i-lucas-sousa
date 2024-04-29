import javax.swing.*;

public class Fibonacci{
    public static void main(String[] args) {

    int numAtual = 0;
    int numAnterior = 0 ; 

    JOptionPane.showMessageDialog(null, "Essa e a sequencia de fibonacci");

	    for (int i = 0; i < 10; i++) {

           if (i == 1) {
                numAtual = 1;
                numAnterior = 0;
                JOptionPane.showMessageDialog(null, numAtual);
            } else {
                numAtual += numAnterior;
                numAnterior = numAtual - numAnterior;
                JOptionPane.showMessageDialog(null, numAtual);
            }
            
        }
    }
}