package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class WaterClassification {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int temperature = s.nextInt();

        if (temperature <= 0) {
            System.out.println("S");
        } else if (temperature>0 && temperature<100){
            System.out.println("L");
        } else {
            System.out.println("G");
        }

    }
}
