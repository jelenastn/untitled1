package Domaci;

import java.util.ArrayList;

public class D_16_Jelena_Stanic {
    public static void main(String[] args) {
        //1. Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
        // jedna lista ce u sebi sadrzati sve parne brojeve dok ce
        // druga lista zadrzati sve neparne brojeve.

        int niz[] ={1,2,3,4,5,6,7,8,9,132,64,57,89};
        ArrayList<Integer>lista1 =new ArrayList<>();
        ArrayList<Integer>lista2 =new ArrayList<>();
        int i;
        for (i=0;i< niz.length;i++){
            if (niz[i]%2==0){
                lista1.add(niz[i]);
            }else{
                lista2.add(niz[i]);
            }
        }
        System.out.println("Parni brojevi izdvojeni iz prvobitnog niza su: "+lista1);
        System.out.println("Neparni brojevi izdvojeni iz prvobitnog niza su: "+lista2);
    }
}
