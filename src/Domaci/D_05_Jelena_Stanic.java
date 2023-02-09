package Domaci;

import java.util.Scanner;

public class D_05_Jelena_Stanic {
    public static void main(String[] args) {
        /*Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite velicinu zeljene majice (cm) - 24, 30, 36 ili 42");
        String vel = sc.nextLine();
        switch(vel){
            case "24", "24cm", "24 cm":
                System.out.println("S velicina");
                break;
            case "30", "30cm", "30 cm":
                System.out.println("M velicina");
                break;
            case "36", "36cm", "36 cm":
                System.out.println("L velicina");
                break;
            case "42", "42cm", "42 cm":
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Greska - nepostojeca velicina");
                break;
        }

    }
}
