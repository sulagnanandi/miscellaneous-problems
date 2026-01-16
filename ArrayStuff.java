package LCC.November;

public class ArrayStuff {
    public static void main1(String[] args) {

        ArrayStuff[] j = new ArrayStuff[5]; //reserves spots for an ArrayStuff object in each index

        int hi = 35;

        int[] something = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(something[hi]); //will only show the ArrayOutOfBoundsException at runtime
    }

    public static void main2(String[] args) {
        int values[] = new int[7];
        int index;

        values[3] = 24;
        index = 4;
        values[index + 2] = values[index - 1]; //u can assign values with integer literal, or int expressions and/or variables

        System.out.println(values[6]);
    }

    public static void main ( String[] args )
    {
        double[] val = new double[4];  // an array of double
        // cells initialized to 0.0
        val[0] = 0.12;
        val[1] = 1.43;
        val[2] = 2.98;

        int j = 3;
        System.out.println( "cell 3: " + val[ j   ] ); //all unassigned are given 0.0
        System.out.println( "cell 2: " + val[ j-1 ] ); //[2]

        j = j-2;
        System.out.println( "cell 1: " + val[ j   ] ); //[1]
    }
}
