package reverse2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse2 {

    List<String> theWords = new ArrayList<>();

    public static void main(String[] args) {
        String words = "Hello how are you today";
        Reverse2 name = new Reverse2();
        // Expected output
        // today you are how Hello
        System.out.println(name.ReverseWords(words));
        new Scanner(System.in).nextLine();
    }

    private String ReverseWords(String word) {
        String singleword = "";

        for (int i = 0; i < word.length(); i++) {
            
            if (word.charAt(i) != ' ') {
                singleword += word.charAt(i);
               // System.out.print(singleword);
            } else {
                theWords.add(singleword + " ");
                singleword = "";
               // System.out.print(singleword);
            }
        }
        theWords.add(singleword + " ");
        String reverseString = "";
        for (int i = theWords.size()-1 ; i >= 0; i--) {
            reverseString += theWords.get(i);
        }

        return reverseString;

    }
}