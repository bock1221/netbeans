
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        double allinvoices = 0;
        int invoices = 0;
        double discounts = 0;
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");

            double subtotal = sc.nextDouble();
            invoices++;

            // calculate the discount amount and total
            double discountPercent = 0.0;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            allinvoices += total;
            discounts += discountAmount;
            double average = allinvoices / invoices;
            double averageDiscount = discounts / invoices;
            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                    + "Discount amount:  " + discountAmount + "\n"
                    + "Invoice total:    " + total + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        double average = allinvoices / invoices;
        double averageDiscount = discounts / invoices;
        String message = "number of invoices :" + invoices + "\n"
                + "average invoice :" + average + "\n"
                + "average discount :" + averageDiscount + "\n";
        System.out.println(message);
    }
}
