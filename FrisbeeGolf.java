package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class FrisbeeGolf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long D = s.nextLong();
        int[] disks = new int[7];

        disks[6] = (int) (D / 1000);
        D = D - 1000 * (D / 1000);

        disks[5] = (int) (D / 500);
        D = D - 500 * (D / 500);

        disks[4] = (int) (D / 100);
        D = D - 100 * (D / 100);

        disks[3] = (int) (D / 50);
        D = D - 50 * (D / 50);

        disks[2] = (int) (D / 10);
        D = D - 10 * (D / 10);

        disks[1] = (int) (D / 5);
        D = D - 5 * (D / 5);

        disks[0] = (int) (D / 1);
        D = D - 1 * (D / 1);


        for (int i = 0; i < disks.length; i++) {
            System.out.print(disks[i] + " ");
        }
    }
}
