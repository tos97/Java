import java.util.Random;
import java.util.Scanner;

public class Matice {

    public static void Gestore(){
        Scanner sc = new Scanner(System.in);
        int row,col,k,bound;
        System.out.println("Esercizio Matrici");
        System.out.println("Inserisci righe e colonne desiderate");
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] m = new int[row][col];
        System.out.println("\nScegli:\n 0) Casualità con scelta del valore per Random\n 1) Casualià con valore fisso");
        k = sc.nextInt();
        switch (k){
            case 0:
                System.out.println("\nInserisci valore di casualità");
                bound = sc.nextInt();
                Carica(row, col, bound);
                break;
            case 1:
                m = Carica(row, col);
                break;
            default:
                System.out.println("ERRORE");
        }
        System.out.println("\nScegli:\n 0) Stampa Verticale\n 1) Stampa Orizontale");
        k = sc.nextInt();
        switch (k){
            case 0: Matice.Verticale(m);break;
            case 1: Matice.Orizzontale(m);break;
            default: System.out.println("ERRORE");
        }
    }

    /**
     * qui si carica la matrice con i valori desiderati specificando anche il buond per l funzione Random
     * @param row prende in ingresso il numero di righe desiderate
     * @param col prende in ingresso il numero di colonne desiderate
     * @param bound valore per la funzione Random
     * @return ritorna la matrice
     */
    public static int[][] Carica(int row, int col, int bound){
        Random rm = new Random();
        int[][] matrix = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                matrix[i][j] = rm.nextInt(bound);
            }
        }
        return matrix;
    }

    /**
     * qui si carica la matrice con i valori desiderati
     * @param row prende in ingresso il numero di righe desiderate
     * @param col prende in ingresso il numero di colonne desiderate
     * @return ritorna la matrice
     */
    public static int[][] Carica(int row, int col){
        int[][] matrix = new int[row][col];
        Random rm = new Random();
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                matrix[i][j] = rm.nextInt(10);
            }
        }
        return matrix;
    }

    /**
     * Stampa Verticale della matrice
     * @param m riceve la matrice in ingresso dalla main
     */
    public static void Verticale(int[][] m){
        System.out.println("\nSTAMPA VERTICALE:");
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j < m[i].length;j++){
                System.out.println("|" + (i+1) + "| |" + (j+1) + "| => " + m[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Stampa Orizzontale della matrice
     * @param m riceve la matrice in ingresso dalla main
     */
    public static void Orizzontale(int[][] m){

        System.out.println("\nSTAMPA ORIZONTALE:");
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j < m[i].length;j++){
                System.out.print("|" + m[i][j] + "| ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
