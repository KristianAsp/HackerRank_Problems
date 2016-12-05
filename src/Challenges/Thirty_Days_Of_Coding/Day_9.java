package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 05/12/2016.
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class Day_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factorial = factorial(number);

        System.out.println(factorial);
    }

    public static int factorial(int n){
        int sum = 1;

        if(n > 1) //Base case. If n = 1, there are no further steps to do in factorial
        {
            sum *= n * factorial(n-1);

        }
        else
        {
            sum = 1;
        }

        return sum;
    }

}
