package Vezbe;

import java.util.ArrayList;

public class D_17_nova_verzija_Jelena_Stanic {
    public static void main(String[] args) {
        //   2. Napraviti proizvoljnu listu imena,
        //   zatim uneti ime koje zelite da izbacite iz liste,
        //   ispisati poruku u zavisnosti od toga da li je izbaceno ili ne
        //   , i da li se uopste nalazi u listi.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Una");
        lista.add("Iva");
        lista.add("Ena");
        lista.add("Una");
        System.out.println("Lista pre brisanja - "+lista);
        int brojac = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Una")) {
                brojac = brojac + 1;
                lista.remove(i);

            }
        }
        System.out.println("Lista posle brisanja - "+lista);
        if (brojac > 0) {
            System.out.println("Ime  je izbrisano " + brojac + " put/a.");
        } else {
            System.out.println("Nemamo to ime na listi, pa nista nije izbrisano!");
        }
    }
}