package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {
private int tamanho;

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {
        // TODO: implemente o código deste método
        int [] fibonacci = new int [tamanho];
        for (int i=0; i<tamanho; i++) {
            if (i==0){
                fibonacci[i]=1;
            }
            if (i==1){
                fibonacci[i]=1;
            }
            else {
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        }
        return fibonacci;
    }

}
