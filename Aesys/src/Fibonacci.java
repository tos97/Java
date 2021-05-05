import java.util.Scanner;

public class Fibonacci {
    public static void Gestore() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Inserisci fin dove arrivare:");
        n = sc.nextInt();
        Stampa(n, 1, 0);
        System.out.println();
    }

    public static void Stampa(int n, int k, int p){
        int s;
        if(n == 0)
            System.out.println();
        else{
            System.out.print(k + " ");
            s = k+p;
            Stampa(n - 1, s, k);
        }
    }
}
