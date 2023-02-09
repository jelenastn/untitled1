package Domaci;

import java.util.Scanner;

public class D_04_Jelena_Stanic {
    public static void main(String[] args) {
        /*
        Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac", "injzenjer" i "masinovodja" i uneti svoju platu. Ispisati u konzoli poziciju koju radis i platu.
Ako ste na poziciji fizikalca, povecati platu za 15%.
Ako ste na poziciji inzenjera, povecati platu za 20%.
Ako ste na poziciji masinovodje, povecati platu za 30%.
Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti poziciju - masinovodja, inzenjer ili fizikalac");
        String pozicija = sc.next();
        System.out.println("Vasa trenutna plata je:");
        double plata = sc.nextDouble();
        double novaplata = plata;
            if (plata > 0) {
                if (pozicija.equalsIgnoreCase("fizikalac")) {
                    novaplata = novaplata * 1.15;
                    System.out.println("Sada " + pozicija + " sa povisicom od 15% dobija platu od " + novaplata + " dinara");
                } else if (pozicija.equalsIgnoreCase("inzenjer")) {
                    novaplata = novaplata * 1.2;
                    System.out.println("Sada " + pozicija + " sa povisicom od 20% dobija platu od " + novaplata + " dinara");
                } else if (pozicija.equalsIgnoreCase("masinovodja")) {
                    novaplata = novaplata * 1.3;
                    System.out.println("Sada " + pozicija + " sa povisicom od 30% dobija platu od " + novaplata + " dinara");
                } else {
                    System.out.println("Pogresan unos");
                }

        }
         else {
                System.out.println("Pogresan unos");
            }
        }
        }


