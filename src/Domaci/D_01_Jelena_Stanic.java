package Domaci;

public class D_01_Jelena_Stanic {
    public static void main(String[] args) {

        String prvo_voce = "banana";
        double prva_cena = 160;
        String drugo_voce = "jabuke";
        double druga_cena = 120;
        String trece_voce = "kruske";
        double treca_cena = 140;
        String cetvrto_voce = "narandze";
        double cetvrta_cena = 200;
        System.out.println("     Snizenje cena - 30%!");
        System.out.println("-------------------------------");
        System.out.println("Nova cena " + prvo_voce + " - "+(prva_cena * 0.7) + " dinara");
        System.out.println("Nova cena " + drugo_voce +" - "+ (druga_cena * 0.7) + " dinara");
        System.out.println("Nova cena " + trece_voce +" - "+ (treca_cena * 0.7) + " dinara");
        System.out.println("Nova cena " + cetvrto_voce +" - "+ (cetvrta_cena * 0.7) + " dinara");
    }
}