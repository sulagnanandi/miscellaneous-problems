package LCC.November;

import java.util.*;

public class SpookyWords {
    public static String[] bubbleSort(String[] S, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if ((char) S[i].charAt(0) > (char) S[j].charAt(0)) {
                    String temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;

                }
            }

        }
        return S;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), Q = in.nextInt();
        String[] S = new String[N];
        int[] K = new int[Q];
        for (int i = 0; i < N; i++) {
            S[i] = in.next();

        }
        for (int i = 0; i < Q; i++) {
            K[i] = in.nextInt();
        }
        Arrays.sort(S);


        S = bubbleSort(S, N);
        for (int i = 0; i < Q; i++) {
            System.out.println(S[K[i] - 1]);
        }
    }

}
