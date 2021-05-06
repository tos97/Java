import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    private int n;
    private BigInteger k = BigInteger.ONE, p = BigInteger.ZERO;

    /**
     * Costruttore Fibonacci
     * @param n numero di elementi da stampare
     */
    public Fibonacci(int n){
        this.n = n;
    }

    public void stampa(){
        BigInteger s;
        if(n == 0)
            System.out.println();
        else{
            System.out.print(k + " ");
            s = k.add(p);
            n--;
            p = k;
            k = s;
            stampa();
        }
    }
}
