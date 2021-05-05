import java.util.Random;


public class Matice {

    /**
     * qui si carica la matrice con i valori desiderati specificando anche il buond per l funzione Random
     * @param row prende in ingresso il numero di righe desiderate
     * @param col prende in ingresso il numero di colonne desiderate
     * @param bound valore per la funzione Random
     * @return ritorna la matrice
     */
    public static int[][] Carica(int row, int col, int bound){
        int[][] matrix = new int[row][col];
        Random rm = new Random();
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
        System.out.println("STAMPA VERTICALE:");
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

        System.out.println("STAMPA ORIZONTALE:");
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j < m[i].length;j++){
                System.out.print("|" + m[i][j] + "| ");
            }
            System.out.println();
        }
    }
}
