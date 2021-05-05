import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int n,k,row,col,pir,bound,a,b;
        do {
            System.out.println("MENU\n 0) Uscita\n 1) Esecizio Matrici\n 2) Esercizio Piramide\n 3) Esercizio Operazioni");
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

                    System.out.println("scegli:\n0 Casualità con scelta del valore per Random\n 1) Casualià con valore fisso\n");
                    k = sc.nextInt();
                    switch (k){
                        case 0:
                            System.out.println("Inserisci valore di casualità");
                            bound = sc.nextInt();
                            m = Matice.Carica(row, col, bound);
                            break;
                        case 1:
                            m = Matice.Carica(row, col);
                            break;
                        default:
                            System.out.println("errore");
                    }

                    System.out.println("scegli:\n0 Stampa Verticale\n 1) per stampa orizontale");
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
                case 3:
                    System.out.println("Scegli l'operazione da voler eseguire:\n 1) Somma\n 2) Sottrazione\n 3) Moltiplicazione\n 4) Divisione\n");
                    k = sc.nextInt();
                    System.out.println("Inserisci i 2 valori su cui lavorare:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    switch (k){
                        case 1: System.out.println(" "+ a + " + "+ b + " = " + Operazoni.Somma(a,b));break;
                        case 2: System.out.println(" "+ a + " - "+ b + " = " + Operazoni.Sottrazione(a,b));break;
                        case 3: System.out.println(" "+ a + " * "+ b + " = " + Operazoni.Moltiplicazione(a,b));break;
                        case 4: System.out.println(" "+ a + " / "+ b + " = " + Operazoni.Divisione(a,b));break;
                        default: System.out.println("Errore");
                    }
                default:
                    System.out.println("errore inserire un numero tra 0 a 2");

            }
        } while(n != 0);
    }
}
