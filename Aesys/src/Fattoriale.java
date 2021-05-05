import java.util.Scanner;

public class Fattoriale {
    public static void Gestore() {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.println("Inserisci un numero:");
        k = sc.nextInt();
        System.out.print("\n" + k + "! = ");
        Stampa(k);
    }

    public static void Stampa(int n){
        if(n == 1 || n == 0)
            System.out.println("1\n");
        else {
            System.out.print(n + " * ");
            Stampa(n-1);
        }
    }
}
