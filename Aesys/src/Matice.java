import java.util.Random;

public class Matice {
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
    
    public static void Verticale(int[][] m){
        System.out.println("STAMPA VERTICALE:");
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j < m[i].length;j++){
                System.out.println("|" + (i+1) + "| |" + (j+1) + "| => " + m[i][j]);
            }
            System.out.println();
        }
    }
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
