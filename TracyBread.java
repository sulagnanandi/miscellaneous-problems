package LCC.December;

import java.util.Scanner;
public class TracyBread {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] temperatures = new int[6];

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = s.nextInt();
        }

        int actualTemp = s.nextInt();

        if (actualTemp >= temperatures[0] && actualTemp <= temperatures[1])
            System.out.println("pumpernickel");
        else if (actualTemp >= temperatures[2] && actualTemp <= temperatures[3])
            System.out.println("sourdough");
        else if (actualTemp >= temperatures[4] && actualTemp <= temperatures[5])
            System.out.println("cornbread");
    }
}

