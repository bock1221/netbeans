/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private Account account;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private Scanner sc = new Scanner(System.in);

    private Account findAccount() {
        System.out.println("please enter first and last name");
        String firstName = sc.next();
        String lastName = sc.next();
        for (Account found : accounts) {
            if (found.getFirstName().equalsIgnoreCase(firstName) && found.getLastName().equalsIgnoreCase(lastName)) {
                return found;
            }
        }
        return null;
    }

    private void populateAccount() {
        System.out.println("please enter your first name");
        account.setFirstName(sc.next());
        System.out.println("please enter your last name");
        account.setLastName(sc.next());
        sc.nextLine();
        System.out.println("please enter your addres ");
        account.setAddres(sc.nextLine());
        System.out.println("please enter your phonenumber");
        account.setPhoneNumber(sc.next());
        account.setAccountNumber();
        accounts.add(account);
        account.accountInfo();
        System.out.println();
        System.out.println("what would you like to do next");
    }

    public void addAccount() {

        System.out.println("Enter a to open savings account \n"
                + "Enter b to open checking account");
        Account account = null;
        switch (sc.next()) {
            case "a":
                account = new SavingsAccount();
                System.out.println(account);
                populateAccount();
                break;
            case "b":
                account = new checkingAccount();
                populateAccount();
                break;
            default:
                account = new checkingAccount();
                break;
        }

    }

    public void controller() {
        for (;;) {
            System.out.println(" Enter a to open a new account \n Enter b to make transactions with existing account "
                    + "\n Enter c to calculate end of month charges\n"
                    +" Enter d to veiw all activity on account");
            String input = sc.next();
            switch (input) {
                case "a":
                    addAccount();
                    break;
                case "b":
                    account=(findAccount());
                    if (account!=null){
                       account.addTransaction();
                    }
                    else 
                        System.out.println("no such name in our system");
                    break;
                case "c":
                     account=(findAccount());
                     if (account!=null){
                     account.calculateBalance();
                     account.endOfMonth();
                     account.accountInfo();
                     System.out.println("your monthley charges have been calculated and can be veiwed with the rest of your transactions");
                     }
                       else 
                        System.out.println("no such name in our system");
                    break;
                   case "d":
                       account=(findAccount());
                    if (account!=null){
                        account.calculateBalance();
                       account.accountInfo();
                       account.display();
                    }
                    else 
                        System.out.println("no such name in our system");
                    break;
                    
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.controller();

    }
}
