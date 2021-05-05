import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int n,k,row,col,pir,bound,a,b;
        do {
            System.out.println("MENU\n 0) Uscita\n 1) Matrici\n 2) Piramide\n 3) Operazioni\n 4) Fattoriale\n 5) Numeri Primi Fino ad un Numero\n 6) Controllose N è Primo\n 7) Fibonacci");
            n = sc.nextInt();
            System.out.println();
            switch (n){
                case 0: System.out.println("Fine Esercizio"); break;
                case 1: Matice.Gestore(); break;
                case 2: Piramide.Gestore(); break;
                case 3: Operazoni.Gestore(); break;
                case 4: Fattoriale.Gestore(); break;
                case 5:
                case 6:
                case 7: Fibonacci.Gestore(); break;
                default: System.out.println("errore inserire un numero tra 0 a 6");
            }
        } while(n != 0);
    }
}
