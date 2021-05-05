import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int n,k,row,col,pir;
        char ris;
        do {
            System.out.println("inserisci un numero\n0: per uscire");
            System.out.println("1: esrecizio matrici");
            System.out.println("2; esercizio piramide ");
            n = sc.nextInt();
            switch (n){
                case 0:
                    System.out.println("fine esercizio");
                    break;
                case 1:
                    System.out.println("esercizio matrici");
                    System.out.println("inserisci righe e colonne desiderate");
                    row = sc.nextInt();
                    col = sc.nextInt();
                    int[][] m = new int[row][col];
                    m = Matice.Carica(row, col);
                    System.out.println("scegli:\n0 per stampa verticale\n1 per stampa orizontale");
                    k = sc.nextInt();
                    switch (k){
                        case 0: Matice.Verticale(m);break;
                        case 1: Matice.Orizzontale(m);break;
                        default: System.out.println("errore");
                    }
                    break;
                case 2:
                    System.out.println("esercizio piramide");
                    System.out.println("inserisci numero di righe da stampare:");
                    pir = sc.nextInt();
                    Piramide.Stampa(pir);
                    break;
                default:
                    System.out.println("errore inserire un numero tra 0 a 2");
            }
        } while(n != 0);
    }
}
