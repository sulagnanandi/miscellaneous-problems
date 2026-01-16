package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class AmeriCanadian {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        char[] insert;

        while (!(word.equalsIgnoreCase("quit!"))){
            insert = new char[word.length()+1];

            for(int i = 0; i<word.length(); i++){
                insert[i] = word.charAt(i);
            }

            char s = word.charAt(word.length()-3);
            if(word.length()>=4 && s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u' && s != 'y') {
                for (int i = word.length() - 1; i >= 0; i--) {

                    if (i == word.length() - 1 && word.charAt(word.length()-2) != 'u' && word.charAt(word.length()-1)=='r') {
                        insert[i+1] = insert[i];
                        insert[i] = 'u';
                    }
                }
            }

            for(char i : insert){
                if(i!=0)
                System.out.print(i);
            }
            System.out.println();

            word = scan.nextLine();
        }

    }
}
