package Domaci;

import java.util.Scanner;

public class D_13_Jelena_Stanic {
    public static void main(String[] args) {
        //1. Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci broj od onih koje smo uneli.
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj clanova niza:");
        int x = sc.nextInt();
        int niz[] = new int[x];
        int max = 0;
        for (int i = 0; i<niz.length;i++){
            System.out.println("Unesi vrednost za " +(i+1)+". clan niza");
            niz[i]=sc.nextInt();
           //naredna tri reda su mi potrebna da bih mogla da poredim i negativne brojeve(npr. unesem samo negativne brojeve)
            if (i==0){
                max = niz[i];
            }
            max = Math.max(niz[i], max);
            /*umesto 19.reda moze i:
              if (niz[i] >= max) {
                max=niz[i];
            } */
        }

        System.out.println("Najveci uneti broj je "+max+".");

    }
}
