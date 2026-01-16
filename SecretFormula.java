package DMOJ_WLMOJ.DMOJ;

import java.util.Scanner;

public class SecretFormula {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] cipher = new String[10];

        //line 1
        for(int i = 0; i<cipher.length;i++){
            cipher[i] = s.next();
        }

        //line 2
        int numOfNums = s.nextInt();

        //line 3
        String[] formula = new String[numOfNums];
        for(int i = 0; i<numOfNums;i++){
            formula[i] = cipher[s.nextInt()];
            System.out.print(formula[i]);
        }
    }
}
