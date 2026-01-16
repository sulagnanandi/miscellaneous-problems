package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class BooleanProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int nots = 0;

        String input = s.nextLine();
        String[] words = input.split(" ");

        for(String word : words){
            if(word.equalsIgnoreCase("not"))
                nots++;
        }

        if(words[words.length-1].equalsIgnoreCase("True")) {
            if(nots % 2 == 0)
            System.out.println("True");
            else
                System.out.println("False");
        } else if (words[words.length-1].equalsIgnoreCase("False")) {
            if(nots % 2 == 0)
            System.out.println("False");
            else
                System.out.println("True");
        }
    }
}
