import java.util.Scanner;

public class Operazoni {
    private float a,b;
    private char k;

    /**
     * Costruttore Operazioni
     * @param a numero 1 da salvare preso dalla tastira
     * @param b numero 2 da salvare preso dalla tastira
     * @param k operando da salvare preso dalla tastira
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
     * Somma
     * @return risultato somma
     */
    public float somma(){
        return a+b;
    }

    /**
     * Sottrazione
     * @return risultato sottrazione
     */
    public float sottrazione(){
        return a-b;
    }

    /**
     * Moltiplicazione
     * @return risultato moltiplicazione
     */
    public float moltiplicazione(){
        return a*b;
    }

    /**
     * Divisione
     * @return risultato divisione
     */
    public float divisione(){
        return a/b;
    }
}
