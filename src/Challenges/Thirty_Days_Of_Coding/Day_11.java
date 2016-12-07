package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 07/12/2016.
 * https://www.hackerrank.com/challenges/30-2d-arrays
 */
public class Day_11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i <= 3; i++)
        {
            for(int y = 0; y <= 3; y++)
            {
                int temp = arr[y][i] + arr[y][i+1] + arr[y][i+2] + arr[y+1][i+1]
                        + arr[y+2][i] + arr[y+2][i+1] + arr[y+2][i+2];

                if(i == 0 && y == 0)
                {
                    sum = temp;
                    continue;
                }

                if(temp > sum)
                {
                    sum =  temp;
                }
            }
        }

        System.out.println(sum);
    }

}
