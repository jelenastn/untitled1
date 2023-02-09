package Domaci;

import java.util.Scanner;

public class D_09_Jelena_Stanic {
    public static void main(String[] args) {
        //3. Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih

        double uporedi = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Unesite pet brojeva i dobićete najveći broj");
            System.out.println( i+1+". broj za poredjenje");
            double broj = sc.nextDouble();
            uporedi = Math.max(broj, uporedi);
        }
        System.out.println("Najveći broj od pet prethodno unesenih brojeva je " + uporedi);
    }
}
