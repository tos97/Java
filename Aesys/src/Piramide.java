import java.util.Scanner;

public class Piramide {

    private int n;

    /**
     * Costruttore Piramide
     * @param n numero di righe che andranno stampate
     */
    public Piramide(int n){
        this.n = n;
    }

    public void stampa(){
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
