package Domaci;

import java.util.Scanner;

public class D_10a_Jelena_Stanic {
    public static void main(String[] args) {
        //1. Napraviti program gde cete uneti neki pozitivan broj i kao rezultat vratiti zbir svih njegovih prethodnih brojeva. (sa while)
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj");
        int broj = sc.nextInt();
        if (broj>=0) {
            int i = 0;
            while(i < broj) {
                suma = suma + i;
                i++;
            }
            System.out.println("Zbir svih prethodnih brojeva od broja "+broj+ " je "+ suma+ ".");
        }else{
            System.out.println("Niste uneli pozitivan broj!");
        }
    }
}
