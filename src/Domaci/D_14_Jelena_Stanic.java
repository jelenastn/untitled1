package Domaci;

import java.util.Scanner;

public class D_14_Jelena_Stanic {
    public static void main(String[] args) {
        //2. Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.
        Scanner sc = new Scanner(System.in);
        int niz[] = {0,-5,-7,-1,6,5};
        for (int i=0; i< niz.length; i++){
            if (niz[i]%2!=0){
                niz[i]=niz[i]+2;
            }
        }
        for (int i=0; i< niz.length; i++){
            System.out.println(niz[i]);
        }
    }
}
