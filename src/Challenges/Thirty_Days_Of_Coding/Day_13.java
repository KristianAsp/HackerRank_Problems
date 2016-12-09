package Challenges.Thirty_Days_Of_Coding;

import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 09/12/2016.
 */
public class Day_13 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title,author,price);
        new_novel.display();
    }

}

class MyBook extends Book
{
    int price;

    MyBook(String title, String author, int price)
    {
        super(title, author);
        this.price = price;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

abstract class Book
{
    String title;
    String author;

    Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}


