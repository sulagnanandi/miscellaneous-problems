package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class TriangleTimes {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();

        if ((a1+a2+a3)==180){
            if(a1==a2 && a2==a3){
                System.out.println("Equilateral");
            } else if (a1 == a2  || a2 == a3 || a1 == a3){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
