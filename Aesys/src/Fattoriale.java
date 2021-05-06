import java.math.BigInteger;
import java.util.Scanner;

public class Fattoriale {

    public static void Gestore() {
        Scanner sc = new Scanner(System.in);
        int k;
        BigInteger s = BigInteger.ONE;
        System.out.println("Inserisci un numero:");
        k = sc.nextInt();
        System.out.print("\n" + k + "! = ");
        Stampa(k, s);

    }

    public static void Stampa(int n, BigInteger s){
        if(n < 0)
            System.out.println("ERRORE\nN negativo\n");
        else {
            if (n == 1 || n == 0)
                System.out.println(s +"\n");
            else {
                s = s.multiply(BigInteger.valueOf(n));
                Stampa(n - 1, s);
            }
        }
    }
}
