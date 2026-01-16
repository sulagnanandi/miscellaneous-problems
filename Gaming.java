package LCC.December;

import java.io.*;
import java.util.*;

public class Gaming {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        boolean [] f = new boolean [K];
        boolean [] s = new boolean [K];
        for(int i = 0; i < K; i++) {
            f[i] = false;
            s[i] = true;
        }

        int games = 0;
        for(int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            for(int j = a-1; j <= b-1;j++) {
                f[j] = true;
            }

        }
        for(int i = 0; i < M; i++) {
            int c = in.nextInt();
            int d = in.nextInt();
            for(int j = c-1; j <= d-1;j++) {
                s[j] = false;
            }

        }
        for(int i = 0; i < K; i++) {
            if(f[i] && s[i])games++;

        }
        System.out.println(games);
    }
}
