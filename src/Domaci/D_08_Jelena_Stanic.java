package Domaci;

import java.util.Scanner;

public class D_08_Jelena_Stanic {
    public static void main(String[] args) {
        //2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int godina_t = 2022;
        int godina_r = sc.nextInt();
        int brojpg =0;
        for(int i=godina_r; i<=godina_t; i++) {
          if(i % 4 == 0 && i %100 != 0 )
            {
                brojpg=brojpg+1;
            }
        else
            if(i % 4 == 0 && i %100 == 0 && i % 400==0){

                brojpg=brojpg+1;
                    }

            }
        System.out.println("Broj prestupnih godina od Vase godine rodjenja "+godina_r+". do tekuce "+godina_t+". - "+brojpg+".");

    }
}
