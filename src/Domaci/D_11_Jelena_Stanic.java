package Domaci;

import java.util.Scanner;

public class D_11_Jelena_Stanic {
    public static void main(String[] args) {
        //2. Napraviti program gde cete uneti broj nekih knjiga na lageru,
        // zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru,
        // izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String,
        // onda samo ispisati stanje knjiga na lageru.
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj knjiga na lageru");
        int x = sc.nextInt();

        int i = 0;

        while (i<x) {
            System.out.println("Unesite string");
            String y = sc.next();
            if (x > 0) {
                if (y.equals(".")) {
                    x = x - 1;
                }
                else {
                    System.out.println("Broj preostalih knjiga je "+x);
                    break;
                }
            }

        }
        if(x==0) {
            System.out.println("Nema vise knjiga na lageru.");

        }

    }


}
