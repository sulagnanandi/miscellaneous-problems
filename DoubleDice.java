package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class DoubleDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int antonia = 100;
        int david = 100;
        int rounds = scanner.nextInt();

        for (int i = 1; i <= rounds; i++) {
            int rollAntonia = scanner.nextInt();
            int rollDavid = scanner.nextInt();

            if (rollDavid > rollAntonia) {
                antonia -= rollDavid;
            } else if (rollAntonia > rollDavid) {
                david -= rollAntonia;
            }
        }

        System.out.println(antonia);
        System.out.println(david);
    }
}
