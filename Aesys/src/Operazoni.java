import java.util.Scanner;

public class Operazoni {

    public static void Gestore() {
        Scanner sc = new Scanner(System.in);
        float a,b;
        char k;
        System.out.println("Scegli l'operazione da voler eseguire tra +,-,*,/ o altro carattere per uscire:\n");
        k = sc.next().charAt(0);
        if(k == '*' || k == '+' || k == '-' || k == '/'){
            System.out.println("Inserisci i 2 valori su cui lavorare:");
            a = sc.nextFloat();
            b = sc.nextFloat();
            Scelta(a,b,k);
        }
    }

    public static void Scelta(float a, float b, char k) {
        float r = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        switch (k) {
            case '+': System.out.println("\n " + a + " + " + b + " = " + (r = Somma(a, b)));break;
            case '-': System.out.println("\n " + a + " - " + b + " = " + (r = Sottrazione(a, b)));break;
            case '*': System.out.println("\n " + a + " * " + b + " = " + (r = Moltiplicazione(a, b)));break;
            case '/': System.out.println("\n " + a + " / " + b + " = " + (r = Divisione(a, b)));break;
            default: System.out.println("Uscita calcolatrice\n");
        }
        if(k == '*' || k == '+' || k == '-' || k == '/'){
            System.out.println("Inserisci altra operazione (o altro carattere per uscire) ed operando per proseguire:");
            k = sc.next().charAt(0);
            if(k == '*' || k == '+' || k == '-' || k == '/') {
                c = sc.nextFloat();
            }
            Scelta(r, c, k);
        }
    }

    /**
     * Operazione
     * @param a numero 1
     * @param b numero 2
     * @return risultato
     */
    public static float Somma(float a, float b){
        return a+b;
    }

    /**
     * Operazione
     * @param a numero 1
     * @param b numero 2
     * @return risultato
     */
    public static float Sottrazione(float a, float b){
        return a-b;
    }

    /**
     * Operazione
     * @param a numero 1
     * @param b numero 2
     * @return risultato
     */
    public static float Moltiplicazione(float a, float b){
        return a*b;
    }

    /**
     * Operazione
     * @param a numero 1
     * @param b numero 2
     * @return risultato
     */
    public static float Divisione(float a, float b){
        return a/b;
    }
}
