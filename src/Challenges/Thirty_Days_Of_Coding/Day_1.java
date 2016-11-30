package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian on 27/11/2016.
 * https://www.hackerrank.com/challenges/30-data-types
 */
public class Day_1 {

    public static void main(String[] args)
    {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        // 1. Declare  variables: one of type int, one of type double, and one of type String.
        int var1;
        double var2;
        String var3;

        // 2. Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
        Scanner scan = new Scanner(System.in);
        var1 = Integer.parseInt(scan.nextLine());
        var2 = Double.parseDouble(scan.nextLine());
        var3 = scan.nextLine();

        /* 3. Use the  operator to perform the following operations:
              - Print the sum of i plus your int variable on a new line.
              - Print the sum of d plus your double variable to a scale of one decimal place on a new line.
              - Concatenate s with the string you read as input and print the result on a new line.
        */

        System.out.println(i + var1);
        System.out.println(d + var2);
        System.out.println(s + var3);

    }


}
