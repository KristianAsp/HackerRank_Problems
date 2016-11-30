package Java.Introduction;

import java.util.Scanner;

/************************************
 Created by Kristian André Aspevik on 14/11/2016.
 https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
 ************************************/


public class Java_Stdin_Stdout1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
