import java.util.Scanner;

public class nPrimo {

    public static void Gestore() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero da controllare:");
        n = sc.nextInt();
        Stampa(n, 2);
    }

    public static void Stampa(int n, int i){
        if (n%i == 0) {
            if (i > n/2)
                System.out.println("Numero primo\n");
            else{
                System.out.println("Numero non primo\n");
            }
        }
        else{
            if(i == 2)
                Stampa(n, i+1);
            else{
                Stampa(n, i+2);
            }
        }
    }
}
