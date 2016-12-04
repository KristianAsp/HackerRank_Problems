package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 02/12/2016.
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class Day_6 {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int numWords = scan.nextInt();

        for(int i = 0; i < numWords; i++)
        {
            String word = scan.next();
            char[] wordCharArray = word.toCharArray();
            String even = "";
            String odd = "";

            for(int y = 0; y < wordCharArray.length; y++)
            {
                if(y % 2 == 0)
                {
                    even += wordCharArray[y];
                }
                else
                {
                    odd += wordCharArray[y];
                }
            }

            System.out.println(even + " " + odd);
        }

        scan.close();
    }
}
