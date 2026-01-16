package LCC.January;

import java.util.Scanner;

public class OscarsSpaceship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numMissions = scan.nextInt();

        for (int i = 0; i < numMissions; i++) { //for each mission

            int numGems = scan.nextInt();
            int powerLevel = scan.nextInt();
            int[] x = new int[numGems];
            int[] y = new int[numGems];
            int[] masses = new int[numGems];

            int currentX = 0; //ship location
            int currentY = 0; //ship location

            for (int j = 0; j < numGems; j++) { //collecting info for each gem at start
                x[j] = scan.nextInt();
                y[j] = scan.nextInt();
                masses[j] = scan.nextInt();
            }

            int totalTravel = 0;
            int numCollected = 0;

            for (int k = 0; numCollected < numGems; k++) {
                //find distances between current location and all points that masses[k] =< powerLevel/5 and != -1
                //find minimum among those distances
                //add masses-i to powerLevel
                //current location is now x[k] and y[k], then masses[k] = -1;
                //do it again


                double[] distances = new double[numGems];

                for (int l = 0; l < numGems; l++) { //find distances between where i am now and all uncollected gems
                   if (masses[l] !=-1)
                        distances[l] = Math.sqrt(Math.pow((x[l] - currentX), 2) + Math.pow((y[l] - currentY), 2));
                   else
                       distances[l] = -1;
                }

                double minDistance = distances[0];
                int collectedIndex = 0;
                boolean noGemsAttainable = false;

                for (int m = 0; m < distances.length; m++) { //find closest attainable gem
                    if ((distances[m] < minDistance && masses[m] <= (powerLevel / 5)) && (distances[m] != -1 && masses[m] != -1)) {
                        minDistance = distances[m];
                        collectedIndex = m;
                    }
                }

                if(minDistance == distances[0]  && !(masses[0] <= (powerLevel / 5))) {
                    System.out.println(-1.0);
                    break;
                }


                totalTravel += distances[collectedIndex];
                powerLevel += masses[collectedIndex];
                masses[collectedIndex] = -1;
                currentX = x[collectedIndex];
                currentY = y[collectedIndex];
                numCollected++;
            }

            System.out.println(totalTravel);
        }

    }
}
