import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TestScoreApp
{     
   
     public static void main(String[] args)
    {
        int i=0;
        int minimum=10;
        int maximum=0;
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        
         int testScore = 0;
        Scanner sc = new Scanner(System.in);
        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            
            // accumulate score count and score total
            if (testScore <= 100)
            {
               if(i!=0){
        maximum=Math.max(testScore,maximum);
        minimum=Math.min(testScore,minimum );
               }
               else{
        maximum=testScore;
        minimum=testScore;
        i++;}
                System.out.println(minimum);
                scoreCount +=1;
                scoreTotal  += testScore;
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }
       double score=(double)scoreTotal;
       double count=(double)scoreCount;
        // display the score count, score total, and average score
        double averageScore = score / count;
        NumberFormat number=NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);
        String round=number.format(averageScore);
        String message = "\n" +
                        "maximum score   " + maximum +"\n" 
                       +"minimum score:  " + minimum +"\n"
                       +"Score count:    " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + round + "\n";
        System.out.println(message);
    }
}