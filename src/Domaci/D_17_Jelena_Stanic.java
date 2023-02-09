package Domaci;

import java.util.ArrayList;

public class D_17_Jelena_Stanic {
    public static void main(String[] args) {
        //2. Napraviti proizvoljnu listu imena,
        // zatim uneti ime koje zelite da izbacite iz liste,
        // ispisati poruku u zavisnosti od toga
        // da li je izbaceno ili ne, i da li se uopste nalazi u listi.
        ArrayList<String>lista=new ArrayList<>();
        lista.add("Iva");
        lista.add("Milica");
        lista.add("Matija");
        lista.add("Milica");
        lista.add("Ana");
        lista.add("Nikola");
        lista.add("Sanja");
        lista.add("Jelena");
        lista.add("Milica");
        lista.add("Matija");
        System.out.println("Lista pre brisanja imena: ");
        for (int i = 0; i<lista.size();i++) {
            System.out.println((i+1)+"."+ lista.get(i));
        }
       for(int i = lista.size()-1; i >= 0; i--){
            if (lista.get(i).equals("Milica")){
                lista.remove("Milica");
            }
        }
        System.out.println("Lista posle brisanja imena Milica: ");
        for (int i = 0; i<lista.size();i++) {
            System.out.println( (i+1)+"."+lista.get(i));
        }
    }
}
