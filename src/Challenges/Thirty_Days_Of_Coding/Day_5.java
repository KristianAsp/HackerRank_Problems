package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 02/12/2016.
 * https://www.hackerrank.com/challenges/30-loops
 */
public class Day_5 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
