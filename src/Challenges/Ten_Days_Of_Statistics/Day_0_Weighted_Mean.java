package Challenges.Ten_Days_Of_Statistics;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 05/12/2016.
 * https://www.hackerrank.com/challenges/s10-weighted-mean
 */
public class Day_0_Weighted_Mean {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int inputLength = scan.nextInt();
        int[][] input = new int[inputLength][2];

        for(int i = 0; i < inputLength; i++)
        {
            input[i][0] = scan.nextInt(); //Stores the values
        }

        for(int i = 0; i < inputLength; i++)
        {
            input[i][1] = scan.nextInt(); //Stores the weights
        }

        DecimalFormat df = new DecimalFormat("#.0");
        double result = WeightedMean(input);
        System.out.println(df.format(result));

    }

    public static double WeightedMean(int[][] input)
    {
        double sum = 0;
        double divisor = 0;

        for (int[] anInput : input) {
            sum += anInput[0] * anInput[1];
            divisor += anInput[1];
        }

        return sum / divisor;
    }
}
