public class Fibonacci{
    public static void main(String[] args) {

    int numAtual = 0;
    int numAnterior = 0 ; 

	    for (int i = 0; i < 10; i++) {

           if (i == 1) {
                numAtual = 1;
                numAnterior = 0;
                System.out.println(numAtual);
            } else {
                numAtual += numAnterior;
                numAnterior = numAtual - numAnterior;
                System.out.println(numAtual);
            }
            
        }
    }
}