/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> account = new ArrayList<Account>();
    
    private void populateAccount(Scanner sc, Account account){
     System.out.println("please enter your first name");
        account.setFirstName(sc.next());
     System.out.println("please enter your last name");
        account.se 
                }
    public void addAccount(Scanner sc) {
        Account account;
        System.out.println("Enter a to open savings account \n"
        + "Enter b to open checking account" );
        switch(sc.next()){
            case "a":
               account=new SavingsAccount();
                break;
            case "b":
              account =new checkingAccount();
                break;
            default:
                account=new checkingAccount();
                break;
          }
     System.out.println("please enter your first name");
        account.setFirstName(sc.next());
     System.out.println("please enter your last name");
        account.se
    }

    public void controller() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a To open a new account \n Enter b to look up an existing account "
                + "\n Enter c To calculate end of month charges");
        String input = sc.next();
        switch(input){ 
            case "a":
                addAccount(sc);
                break;
            case "b":
                edit();
                break;
            case "c:":
                monthley();
                break;
        }
        }
    

    

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.controller();

    }
}
