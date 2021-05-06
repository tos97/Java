import java.util.Random;
import java.util.Scanner;

public class Matice {

    private int[][] matrix;
    private int bound = 10;
    Random rm = new Random();

    public Matice(int[][] matrice){
        this.matrix = matrice;
    }

    public void carica(){
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[1].length;j++){
                matrix[i][j] = rm.nextInt(bound);
            }
        }
    }

    public void carica( int bound){
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[1].length;j++){
                matrix[i][j] = rm.nextInt(bound);
            }
        }
    }
    public void verticale(){
        System.out.println("\nSTAMPA VERTICALE:");
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                System.out.println("|" + (i+1) + "| |" + (j+1) + "| => " + matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void orizzontale(){

        System.out.println("\nSTAMPA ORIZONTALE:");
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                System.out.print("|" + matrix[i][j] + "| ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
