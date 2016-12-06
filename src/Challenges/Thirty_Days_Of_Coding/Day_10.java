package Challenges.Thirty_Days_Of_Coding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 06/12/2016.
 * https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class Day_10 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        String binaryValue = toBinary(input);
        int output = consecutiveOnes(binaryValue);

        System.out.println(output);
    }

    public static int consecutiveOnes(String binaryValue)
    {
        String[] sequences = binaryValue.split("0+"); //Split the input into Strings where the 0 are the separators
        Arrays.sort(sequences); //Sort the array which will make the longest sequence of 1's the last index.
        int result = sequences[sequences.length - 1].length();
        return result;
    }

    public static String toBinary(int input)
    {
        return Integer.toString(input,2);
    }

}
