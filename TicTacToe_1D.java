package LCC.December;


import java.io.*;
import java.util.*;

public class TicTacToe_1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        //System.out.println(N);
        String str = in.next();
        //System.out.println(str);
        int O = 0;
        int X = 0;
        int i = 0;
        while (O != 3 && i < N) {
            if (str.substring(i, i + 1).equals("O")) O++;
            else O = 0;
            i++;

        }
        i = 0;
        while (X < 3 && i < N) {
            if (str.substring(i, i + 1).equals("X")) X++;
            else X = 0;
            i++;
        }
        if (O == 3 && X == 3) {
            System.out.println("Indeterminate");
        } else if (O == 3) {
            System.out.println("Oscar Wins");

        } else if (X == 3) {
            System.out.println("Xyla Wins");

        } else {
            System.out.println("Indeterminate");
        }


    }
}

