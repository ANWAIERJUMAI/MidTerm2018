package string.problems;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String s1 = "mary";
        String s2 = "army";
        int k = 0;
        List<String> matchedChar = new ArrayList<String>();
        String charmatch = "";

        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();

        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (ch1[i] == ch2[j]) {
                        k++;
                        charmatch = String.valueOf(ch1[i]);
                        System.out.println(charmatch);
                        matchedChar.add(charmatch);
                        System.out.println("Arraylist value is " + matchedChar.toString());
                        System.out.println(matchedChar.size());
                    }
                }

                k = 0;
            }

            String arrayValue = matchedChar.toString();
            System.out.println("Array value is " + arrayValue);

            if (arrayValue.contains(s2)) {

                System.out.println("String 1 and String 2 are anagrams of each other");
            }
        }
    }
}