import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceApp
{
    private static double checkIfDouble(Scanner sc){
        double subtotal=0.0;
        boolean isValid=false;
      while(isValid==false){
        System.out.println("please enter a subtotal");
      if(sc.hasNextDouble()){
          subtotal= sc.nextDouble();
         //if(subtotal>0 && subtotal<=100000){
             sc.nextLine();
         
           }
          else
      {
      System.out.println("you have enterd leters or symbols \n you need to enter  numbers only from 1-10000 ");
      sc.nextLine();
      continue;
      }
      if(subtotal>0&&subtotal<=1000)
      isValid=true;
      else
          System.out.println("your entry is less than 0 or more than 1000 please reenter a valid number");
                  
      }return subtotal;
    }
    
    private static String validateCustomerType(Scanner sc)
    { boolean isValid=false;
    String customerType="";
        while(isValid==false){
           System.out.print("Enter customer type (r/c): ");
            customerType = sc.next();
           // sc.nextLine();
            if(customerType.equalsIgnoreCase("r")||customerType.equalsIgnoreCase("c"))
            {
            sc.nextLine();
           isValid=true;}
            else
            {
            System.out.println("you have entered a invalid choice" );
            sc.nextLine();
            
            }
        }return customerType;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        double subtotal=0;
        while (!choice.equalsIgnoreCase("n"))
        {
           String customerType=validateCustomerType(sc);
           
          
          
               
        
            try{    
             subtotal = checkIfDouble(sc);
           
            }
            catch(InputMismatchException e)
            {
               sc.next();
               System.out.println("number entered is invalid enter a number consisting only of digits ");
            }
           
            
            // get the discount percent
            double discountPercent = 0;
            if (customerType.equalsIgnoreCase("R"))
            {
                if (subtotal < 100)
                    discountPercent = 0;
                else if (subtotal >= 100 && subtotal < 250)
                    discountPercent = .1;
                else if (subtotal >= 250)
                    discountPercent = .2;
            }
            else if (customerType.equalsIgnoreCase("C"))
            {
                if (subtotal < 250)
                    discountPercent = .2;
                else
                    discountPercent = .3;
            }
            else
            {
                discountPercent = .1;
            }
            
            // calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            
            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                    "Discount percent: " + percent.format(discountPercent) + "\n" +
                    "Discount amount:  " + currency.format(discountAmount) + "\n" +
                    "Total:            " + currency.format(total) + "\n");
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            sc.nextLine();
            System.out.println();
        }
    }
}