package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 30/11/2016.
 * https://www.hackerrank.com/challenges/30-operators
 */
public class Day_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextDouble(); // tip percentage
        double taxPercent = scan.nextDouble(); // tax percentage
        scan.close();

        // Calculation code.
        double tempCost = mealCost + tipPercent / 100 * mealCost + taxPercent / 100 * mealCost;
        // Round the tempCost to nearest integer.
        int totalCost = (int) Math.round(tempCost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");


    }

}
