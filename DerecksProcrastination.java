package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class DerecksProcrastination {

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        int assignments = s.nextInt();
        int start = 0;

        for(int i = 1; i<=assignments; i++){
            start += s.nextInt()*s.nextInt();
        }
        System.out.println(start);
    }
}
