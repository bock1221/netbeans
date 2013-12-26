import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoreApp
{
    public static int getIntWithinRange(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }
	
    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else 
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
        
            sc.nextLine();
        }
        return i;
    }
    public static void main(String[] args)
    {
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        double averageScore = 0;

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (!choice.equalsIgnoreCase("n"))
        {
            // get the input from the user
            
            testScore = getIntWithinRange(sc,"please enter a test score between 0-100: ",0,101);

            scoreCount += 1;
            scoreTotal += testScore;

            averageScore = (double) scoreTotal / (double) scoreCount;
            // see if the user wants to enter more test score
            boolean isValid = false;
           while(isValid==false){
            System.out.print("Enter another test score? (y/n): ");
           
            choice = sc.next();
            if(choice.equals("y")||choice.equals("n"))
                isValid=true;
            else 
                System.out.println("you have entered a invalid choice");
           }
            sc.nextLine();
        }

        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + number.format(averageScore) + "\n";
        System.out.println(message);
    }
}