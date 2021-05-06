import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    private int n;
    private BigInteger k,p;

    public Fibonacci(int n, BigInteger k, BigInteger p){
        this.n = n;
        this.k = k;
        this.p = p;
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
