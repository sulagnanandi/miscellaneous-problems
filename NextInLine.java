package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class NextInLine {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int youngest = s.nextInt();
        int middle = s.nextInt();

        int oldest = middle+(middle-youngest);

        System.out.println(oldest);
    }
}
