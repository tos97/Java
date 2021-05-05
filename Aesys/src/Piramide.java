public class Piramide {
    /**
     * Stampa una piramide con *
     * @param n è il numero di righe che l'utente vuole stampare
     */
    public static void Stampa(int n){
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
