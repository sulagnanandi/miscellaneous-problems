package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class WhosInTheMiddle {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        int b3 = scan.nextInt();

        if((b1>b2 && b1<b3) || (b1>b3 && b1<b2)){
            System.out.println(b1);
        } else if((b2>b3 && b2<b1) || (b2>b1 && b2<b3)){
            System.out.println(b2);
        }else if((b3>b2 && b3<b1) || (b3>b1 && b3<b2)){
            System.out.println(b3);
        }
    }
}
