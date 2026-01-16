package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class Squares {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double tiles = scan.nextInt();

        int maxSideLength = (int) Math.sqrt(tiles);

        System.out.println("The largest square has side length "+maxSideLength+".");
    }
}
