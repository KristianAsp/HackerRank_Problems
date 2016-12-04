package Challenges.Thirty_Days_Of_Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 03/12/2016.
 * https://www.hackerrank.com/challenges/30-arrays
 */
public class Day_7 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] input = new int[arraySize];

        for(int i = 0; i < arraySize; i++)
        {
            input[i] = scan.nextInt();
        }

        for(int i = arraySize - 1; i >= 0; i--)
        {
            System.out.print(input[i] + " ");
        }

        scan.close();
    }

}
