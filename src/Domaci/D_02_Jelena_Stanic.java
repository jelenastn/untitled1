package Domaci;

import java.util.Scanner;

public class D_02_Jelena_Stanic {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite Vasu godinu rodjenja: ");
        int godina_r = unos.nextInt();
        System.out.println("Unesite trenutnu kalendarsku godinu:");
        int godina_t = unos.nextInt();
        System.out.println("Vi imate "+ (godina_t-godina_r)+" godina/e.");
    }
}
