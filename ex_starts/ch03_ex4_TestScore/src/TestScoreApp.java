import java.util.Scanner;
import java.math.*;

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        
       // BigDecimal decimalscoreTotal=new BigDecimal(scoreTotal);
        //BigDecimal decimalscoreCount=new BigDecimal(scoreCount);
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 998)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            if (sc.hasNextInt())
                isvalid=true;
            else 
                isvalid == false;

            // accumulate score count and score total
            if (testScore <= 100&&isvalid==true)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        BigDecimal decimalscoreTotal=new BigDecimal(scoreTotal);
        BigDecimal decimalscoreCount=new BigDecimal(scoreCount);
     BigDecimal average =decimalscoreTotal.divide(decimalscoreCount, 1, RoundingMode.UP);
        //double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + average + "\n";
        System.out.println(message);
    }
}