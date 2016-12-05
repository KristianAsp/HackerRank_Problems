package Challenges.Ten_Days_Of_Statistics;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 05/12/2016.
 * https://www.hackerrank.com/challenges/s10-basic-statistics
 */
public class Day_0_Mean_Median_Mode {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int inputLength = scan.nextInt();
        int[] input = new int[inputLength];

        for(int i = 0; i < inputLength; i++)
        {
            input[i] = scan.nextInt();
        }

        DecimalFormat df = new DecimalFormat("#.0");
        double mean = mean(input);
        System.out.println(df.format(mean));

        double median = median(input);
        System.out.println(df.format(median));

        int mode = mode(input);
        System.out.println(mode);

        scan.close();
    }

    public static double mean(int[] input)
    {
        double sum = 0;

        for(int i : input)
        {
            sum += i;
        }

        return sum/input.length;
    }

    public static double median(int[] input)
    {
        double sum;
        Arrays.sort(input);

        if(input.length % 2 == 0)
        {
            int medianA = input.length / 2;
            int medianB = (input.length / 2) - 1;

            sum = (double)(input[medianA] + input[medianB]) / 2;
        }
        else
        {
            int medianA = (input.length - 1) / 2;
            sum = (double)input[medianA];
        }

        return sum;
    }

    public static int mode(int[] input)
    {
        HashMap<Integer, Integer> modeCount = new HashMap<>();

        for(int value : input)
        {
            if(modeCount.containsKey(value))
            {
                int currentCount = modeCount.get(value);
                modeCount.put(value, currentCount + 1);
            }
            else
            {
                modeCount.put(value, 1);
            }
        }

        int maxCount = 0;
        int maxKey = 9999999;

        for(int key : modeCount.keySet())
        {
            System.out.println(key);
            if(modeCount.get(key) > maxCount)
            {
                System.out.println("Goes here first");
                maxKey = key;
                maxCount = modeCount.get(key);
            }
            else if(modeCount.get(key) == maxCount)
            {
                if(key < maxKey)
                {
                    maxKey = key;
                }
            }
        }

        return maxKey;

    }
}
