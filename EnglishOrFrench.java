package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class EnglishOrFrench {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        String[] sentences = new String[lines];

        scan.nextLine();

        int s = 0;
        int t = 0;

        for (int i = 0; i < lines; i++) {
            sentences[i] = (scan.nextLine()).toString();

            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == 's' || sentences[i].charAt(j) == 'S') {
                    s++;
                } else if (sentences[i].charAt(j) == 't' || sentences[i].charAt(j) == 'T') {
                    t++;
                }
            }

        }

        if (t > s) {
            System.out.println("English");
        } else if (s > t) {
            System.out.println("French");
        } else if (s==t){
            System.out.println("French");
        }
    }
}
