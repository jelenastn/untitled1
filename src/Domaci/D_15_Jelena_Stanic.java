package Domaci;

import java.util.Scanner;

public class D_15_Jelena_Stanic {
    public static void main(String[] args) {
        //3. Napraviti proizvoljan niz brojeva,
        // zatim uneti preko Scanner-a neki broj,
        // i u novom nizu smestiti sve brojeve
        // koji su veci od tog unetog broja
        // (Obratiti paznju da nov niz nema prazna polja tj 0).


        int niz1[]={23,45,67,78,99};
        //int niz2[] = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int x = sc.nextInt();
        int y=0;
        for (int i=0; i< niz1.length; i++){
            if (x<niz1[i]){
                y=y+1;
            }
        }
        int niz2[] = new int[y];
        int j = 0;
        for (int i=0; i<niz1.length; i++){
            if (x<niz1[i]){
                niz2[j]=niz1[i];
               j++;
            }
        }
        if (y==0) {
            System.out.println("U početnom nizu nema većeg broja od unetog.");
        }else {
            System.out.println("Clanovi novog niza veci od Vaseg broja " + x + " su: ");
            for (j = 0; j < niz2.length; j++) {
                System.out.println(niz2[j]);
            }
        }
    }
}
