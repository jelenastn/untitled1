package Domaci;

import java.util.Scanner;

public class D_07_Jelena_Stanic {
    public static void main(String[] args) {
        //1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.
        int faktorijel = 1;
        System.out.println("IZRACUNAVANJE FAKTORIJELA UNETOG BROJA");
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj");
           int broj = sc.nextInt();
        if (broj<0){
            System.out.println("Niste uneli pozitivan broj!");
        } else if (broj>0) {
            for (int i=1; i<=broj; i++ ) {
                faktorijel = faktorijel * i;
        }
        }
        System.out.println("Faktorijel broja "+broj+" je "+faktorijel+".");



    }
}
