package LCC.November;

import java.util.*;
//
public class CostumeContest {
    //
//    int numJudges;
//    int [] allScores;
//    int highestScore;
//
//
//    public void findingHighestScore(){
//        highestScore = allScores[0];
//
//        for (int i = 1; i < allScores.length; i++){
//
//            if (allScores[i]>highestScore){
//                highestScore = allScores[i];
//            }
//        }
//    }
//
//    public void totalScore(){
//        int totalScore = 0;
//
//        for (int i = 0; i < allScores.length; i++){
//            totalScore += allScores[i];
//        }
//        totalScore -= highestScore;
//        System.out.println(totalScore);
//    }
//
//
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numJudges = in.nextInt();
        int[] allScores = new int[numJudges];
        int highestScore;


        for (int i = 0; i < numJudges; i++) {
            allScores[i] = in.nextInt();
        }
        highestScore = allScores[0];

        for (int i = 0; i < allScores.length; i++) {

            if (allScores[i] > highestScore) {
                highestScore = allScores[i];
            }
        }

        int totalScore = 0;

        for (int i = 0; i < numJudges; i++) {
            totalScore += allScores[i];
        }
        totalScore -= highestScore;
        System.out.println(totalScore);
    }

}


