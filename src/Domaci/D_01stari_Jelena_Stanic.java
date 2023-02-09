package Domaci;

import java.util.Scanner;

public class D_01stari_Jelena_Stanic {
    public static void main(String[] args) {
        Scanner voce = new Scanner(System.in);
        System.out.println("Unesite naziv prvog voca");
        String prvovoce = voce.next();
        System.out.println("Unesite cenu prvog voca");
        double prvacena = voce.nextDouble();
        System.out.println("Unesite naziv drugog voca");
        String drugovoce = voce.next();
        System.out.println("Unesite cenu drugog voca");
        double drugacena = voce.nextDouble();
        System.out.println("Unesite naziv treceg voca");
        String trecevoce = voce.next();
        System.out.println("Unesite cenu treceg voca");
        double trecacena = voce.nextDouble();
        System.out.println("Unesite naziv cetvrtog voca");
        String cetvrtovoce = voce.next();
        System.out.println("Unesite cenu cetvrtog voca");
        double cetvrtacena = voce.nextDouble();
        System.out.println("Sniženje 30%!");
        System.out.println("Nova cena za "+prvovoce+":");
        System.out.println((prvacena*0.7)+" dinara");
        System.out.println("Nova cena za "+drugovoce+":");
        System.out.println((drugacena*0.7)+" dinara");
        System.out.println("Nova cena za "+ trecevoce+":");
        System.out.println(trecacena*0.7+" dinara");
        System.out.println("Nova cena za "+cetvrtovoce+":");
        System.out.println(cetvrtacena*0.7+" dinara");

    }
}
