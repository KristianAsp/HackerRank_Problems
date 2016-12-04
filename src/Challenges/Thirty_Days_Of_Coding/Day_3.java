package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 30/11/2016.
 * https://www.hackerrank.com/challenges/30-conditional-statements
 */
public class Day_3 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String result = "";

        // If the remainder of n/2 = 1, it is odd
        if(n % 2 == 1)
        {
            result = "Weird";
        }
        else
        {
            if(n > 1 && n < 6) {
                result = "Not Weird";
            }
            else if(n > 5 && n < 21){
                result = "Weird";
            }
            else if(n > 20){
                result = "Not Weird";
            }
        }

        System.out.println(result);
    }

}
