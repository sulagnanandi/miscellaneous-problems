package LCC.December;

import java.util.Scanner;

public class GridSum {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int numRows = s.nextInt(); //N
        int numColumns = s.nextInt(); //M
        int[][] grid = new int[numRows][numColumns];

        int i = 0;
        int j = 0;
        int sumOfEvens = 0;

        for (i = 0; i < numRows; i++){

            for (j = 0; j < numColumns; j++) {
                grid[i][j] = s.nextInt();

                if (((i+1)%2 == 0 || (j+1)%2 ==0) && grid[i][j] % 2 == 0){
                    sumOfEvens += grid[i][j];
                }
            }
        }
        System.out.println(sumOfEvens);
    }
}
