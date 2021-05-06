import java.math.BigInteger;

public class Fattoriale {
    private int n;
    private BigInteger s;

    /**
     * Costruttore Fattoriale
     * @param n numero da fattoriazzare
     * @param s somma fattorizzazione
     */
    public Fattoriale(int n, BigInteger s){
        this.n = n;
        this.s = s;
    }

    public void stampa(){
        if(n < 0)
            System.out.println("ERRORE\nN negativo\n");
        else {
            if (n == 1 || n == 0)
                System.out.println(s +"\n");
            else {
                s = s.multiply(BigInteger.valueOf(n));
                n--;
                stampa();
            }
        }
    }
}
