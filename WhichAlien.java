package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class WhichAlien {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int antennae = s.nextInt();
        int eyes = s.nextInt();

        if(antennae>=3 && eyes <= 4)
            System.out.println("TroyMartian");

        if(antennae<=6 && eyes>=2)
            System.out.println("VladSaturnian");

        if(antennae<=2 && eyes<=3)
            System.out.println("GraemeMercurian");
    }
}
