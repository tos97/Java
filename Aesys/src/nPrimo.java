import java.util.Scanner;

public class nPrimo {
    private int n,i = 2;

    public nPrimo(int n){
        this.n = n;
    }

    public void stampa(){
        if (n%i == 0) {
            if (i > n/2)
                System.out.println("Numero primo\n");
            else{
                System.out.println("Numero non primo\n");
            }
        }
        else{
            if(i == 2){
                i++;
                stampa();
            }
            else{
                i+=2;
                stampa();
            }
        }
    }
}
