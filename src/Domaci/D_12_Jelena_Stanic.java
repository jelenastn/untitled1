package Domaci;

import java.util.Scanner;

public class D_12_Jelena_Stanic {
    public static void main(String[] args) {
        //3. Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
        // kruske 100 din i banane 140 din, tako da se suma
        //racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
        // toliko dodajemo na sumu, kada se unese ".",
        //program izlazi iz petlje i pise ukupnu cenu navedenog voca.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi - jabuka, kruska ili banana da dodas voce u korpu ili . da prekines unos i dobijes ukupnu sumu");
        String voce = sc.next();

        int suma = 0;
        while(!voce.equals(".")){

           if (voce.equalsIgnoreCase("jabuka")) {
               suma = suma +50;
           }
           else if (voce.equalsIgnoreCase("banana")){
               suma = suma + 140;
           }
           else if (voce.equalsIgnoreCase("kruska")){
               suma = suma + 100;
           }

            voce = sc.next();
        }
        System.out.println("Ukupna cena za korpu je "+suma+" dinara.");
    }
}
