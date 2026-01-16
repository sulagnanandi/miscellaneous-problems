package LCC.December;

import java.util.Scanner;

public class Spadunk {
    static double x;
    static double y;
    static double v;

    public static void blast (double v) {
        x *= v;
        y *= v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        x = in.nextDouble();
        y = in.nextDouble();

        v = in.nextDouble();

        blast(v);

    }
}
