package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 09/12/2016.
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day_12 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person
{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores)
    {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate()
    {
        int sum = 0;
        for (int score : testScores)
        {
            sum += score;
        }

        sum = sum / testScores.length;
        char result = 0;
        if(sum < 40)
        {
            result = 'T';
        }
        else if(sum >= 40 && sum < 55)
        {
            result = 'D';
        }
        else if(sum >= 55 && sum < 70)
        {
            result = 'P';
        }
        else if(sum >= 70 && sum < 80)
        {
            result = 'A';
        }
        else if(sum >= 80 && sum < 90)
        {
            result = 'E';
        }
        else if(sum >= 90 && sum <= 100)
        {
            result = 'O';
        }

        return result;
    }
}
