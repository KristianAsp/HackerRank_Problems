package Challenges.Thirty_Days_Of_Coding;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristian André Aspevik on 04/12/2016.
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 */
public class Day_8 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int phoneBookEntries = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>(phoneBookEntries);

        for(int i = 0; i < phoneBookEntries; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while(in.hasNext())
        {
            String lookupKey = in.next();
            if(phoneBook.containsKey(lookupKey)){
                int result = phoneBook.get(lookupKey);
                System.out.println(lookupKey + "=" + result);
            }
            else{
                System.out.println("Not found");
            }
        }

        in.close();
    }

}
