package Domaci;

import java.util.Scanner;

public class D_03_sa_casa_Jelena_Stanic {
    public static void main(String[] args) {
        /*
        Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..), zatim izracunavate godine radnog iskustva,
ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer(Napraviti ispis "Ti si Junior programer"),
ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"), ako imate vise od 8 godina
onda ste direktor firme("Vi ste direktor firme").
         */
        Scanner sc = new Scanner(System.in);
        int godina_t = 2022;
        System.out.println("Unesite godinu kada ste poceli da radite:");
        int godina_p = sc.nextInt();
        int razlika = godina_t-godina_p;
        if(razlika<=4){
            System.out.println("Ti si Junior programer");
        } else if (razlika >8) {
            System.out.println("Ti si direktor firme");

        }
        else {
            System.out.println("Ti si Senior programer");
        }
    }
}
