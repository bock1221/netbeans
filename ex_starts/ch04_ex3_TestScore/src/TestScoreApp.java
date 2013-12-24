import java.util.*;

public class TestScoreApp
{
    public static void main(String[] args){
            String moreScores="y";
            newAverage:
    while(moreScores.equals("y")){
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
       // System.out.println("To enter a new set of scores enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

       
       
        
        
             System.out.print("Enter number of test scores to be entered ");
            int numberOfScores=sc.nextInt();
            
            for(int i=0;i<numberOfScores;i++){
                try
                {
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
                }
            catch(InputMismatchException e)
            {
                sc.next();
                System.out.println("invalid number try again");
                i--;
            }

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount = scoreCount + 2;
                scoreTotal = scoreTotal + testScore;
            }
           else {
                System.out.println("Invalid entry, not counted");
            i--;
            }}
           // if(testScore==999&&i==0)
               // continue newAverage;
            
       // }} while (testScore != 999);
        
        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n";
        System.out.println(message);
        System.out.println("do you want to continue y/n");
        
                moreScores=sc.next();
           
        
    }
        }}
