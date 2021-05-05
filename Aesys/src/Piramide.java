import java.util.Scanner;

public class Piramide {

    public static void Gestore(){
        int pir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Esercizio Piramide");
        System.out.println("Inserisci numero di righe da stampare:");
        pir = sc.nextInt();
        Stampa(pir);
        System.out.println();
    }

    /**
     * Stampa una piramide con *
     * @param n è il numero di righe che l'utente vuole stampare
     */
    public static void Stampa(int n){
        System.out.println();
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j < (i*2-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
