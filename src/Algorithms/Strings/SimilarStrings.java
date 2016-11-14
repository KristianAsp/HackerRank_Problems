package Algorithms.Strings;

import java.util.*;

public class SimilarStrings {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int wordLength = scan.nextInt();
        int queries = scan.nextInt();
        String word = scan.next();
        int similarStrings = 0;
        for(int i = 0; i < queries; i++)
        {
            int firstIndex = scan.nextInt();
            int secondIndex = scan.nextInt();
            int substringLength = secondIndex - firstIndex + 1;

            if(firstIndex == secondIndex){
                System.out.println(wordLength);
                continue;
            }

            String tempWord = word.substring(firstIndex - 1, secondIndex);
            String substring;
            for(int startIndex = 0, endIndex = substringLength; startIndex < word.length()- substringLength + 1; startIndex++)
            {
                substring = word.substring(startIndex, endIndex);
                if(isIsomorphic(tempWord, substring)){
                    similarStrings++;
                }
                endIndex++;
            }

            System.out.println(similarStrings);
            similarStrings = 0;

        }
    }

    private static boolean isIsomorphic(String word, String substring)
    {
        Map<Character,Character> patternMap = new HashMap();
        if(word.length() != substring.length()){
            return false;
        }


        for(int i=0;i<word.length();i++){
            char wordChar = word.charAt(i);
            char substringChar = substring.charAt(i);
            if(!patternMap.containsKey(wordChar))
            {
                if(patternMap.containsValue(substringChar))
                {
                    return false;
                }
                patternMap.put(wordChar, substringChar);
            }
            else if(patternMap.get(wordChar)!=substringChar)
            {
                return false;
            }
        }
        return true;
    }
}
