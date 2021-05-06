import java.util.Scanner;

public class Operazoni {
    private float a,b;
    private char k;

    /**
     *
     * @param a
     * @param b
     * @param k
     */
    public Operazoni(float a, float b, char k){
        this.a = a;
        this.b = b;
        this.k = k;
    }

    public void scelta() {
        float r = 0,c = 0;
        Scanner sc = new Scanner(System.in);
        switch (k) {
            case '+': System.out.println("\n " + a + " + " + b + " = " + (r = somma()));break;
            case '-': System.out.println("\n " + a + " - " + b + " = " + (r = sottrazione()));break;
            case '*': System.out.println("\n " + a + " * " + b + " = " + (r = moltiplicazione()));break;
            case '/': System.out.println("\n " + a + " / " + b + " = " + (r = divisione()));break;
            default: System.out.println("Uscita calcolatrice\n");
        }
        if(k == '*' || k == '+' || k == '-' || k == '/'){
            System.out.println("Inserisci altra operazione (o altro carattere per uscire) ed operando per proseguire:");
            k = sc.next().charAt(0);
            if(k == '*' || k == '+' || k == '-' || k == '/') {
                c = sc.nextFloat();
            }
            a = r;
            b = c;
            scelta();
        }
    }

    /**
     * Operazione
     * @return risultato
     */
    public float somma(){
        return a+b;
    }

    /**
     * Operazione
     * @return risultato
     */
    public float sottrazione(){
        return a-b;
    }

    /**
     * Operazione
     * @return risultato
     */
    public float moltiplicazione(){
        return a*b;
    }

    /**
     * Operazione
     * @return risultato
     */
    public float divisione(){
        return a/b;
    }
}
