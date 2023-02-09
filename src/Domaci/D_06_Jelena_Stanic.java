package Domaci;

import java.util.Locale;
import java.util.Scanner;

public class D_06_Jelena_Stanic {
    public static void main(String[] args) {
        /*Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi) nakon toga,
        uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
        takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti zanr knjige - Romantika, Triler, Horor ili Krimi");
        String zanr = sc.next().toLowerCase(Locale.ROOT);
        System.out.println("Uneti godinu izdanja knjige (u formatu od četiri broja npr. 1992)");
        int godina_i = sc.nextInt();
        int godina_t = 2022;
        int razlika = godina_t - godina_i;

       switch (zanr) {
           case "triler", "romantika":
               if (razlika > 30 || razlika < 0) {
                   System.out.println("Knjiga nije na lageru");
               } else {
                   System.out.println("Knjiga je na lageru");

               }
               break;

           case "horor":
               if (razlika > 40 || razlika < 0) {
                   System.out.println("Knjiga nije na lageru");
               } else {
                   System.out.println("Knjiga je na lageru");
               }
               break;

           case "krimi":
               if (razlika > 20 || razlika < 0) {
                   System.out.println("Knjiga nije na lageru");
               } else {
                   System.out.println("Knjiga je na lageru");
               }
               break;
           default:
               System.out.println("Pogresno upisan zanr");
               break;

       }

    }

}