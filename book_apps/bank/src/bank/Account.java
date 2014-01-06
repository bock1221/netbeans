/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Account implements InterfaceExample {

    protected int accountNumber;
    protected String firstName;
    protected String lastName;
    protected String addres;
    protected String phoneNumber;
    protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    protected double currentBalance = 0;
    protected double totalMonthleyDeposits;
    protected double totalMonthleywithdrawels;

        
    

    public void accountInfo() {

        System.out.println("welcome " + firstName + " " + lastName + "\n"
                + "Your account number is: " + accountNumber);
    }

    public void setAccountNumber() {
        Random r = new Random();
        int numbers = 100000 + (int) (r.nextFloat() * 900000);
        accountNumber = numbers;
    }

    public void setFirstName(String fname) {
        firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lname) {
        lastName = lname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNUmber() {
        return phoneNumber;
    }

    public void addTransaction() {

        for (;;) {
            Scanner sc = new Scanner(System.in);
            Transaction tr = new Transaction();
            System.out.println("enter d  for debit or c for credit");
            tr.setType(sc.next().charAt(0));
            
            System.out.println("enter amount");
            tr.setAmount(sc.nextDouble());
            System.out.println("enter Source of funds");
            tr.setSource(sc.next());
            transactions.add(tr);
            System.out.println("enter t for more transactions or m for main menu");
            if (!sc.next().equalsIgnoreCase("t")) {
                return;
            }
        }
    }

    public void endOfMonth() {
    }

    public void display() {
        System.out.println("transaction type 'd' is debit 'c' is a credit");
        for (Transaction transaction : transactions) {
           
            System.out.println("type: " + transaction.getType());
            System.out.println("amount: " + transaction.getAmount());
            System.out.println("source: " + transaction.getSource());
           
           }System.out.println("currentBalance: "+currentBalance);
            System.out.println("totalMonthleyDeposits: "+totalMonthleyDeposits);
            System.out.println("totalMonthleywithdrawels: "+totalMonthleywithdrawels);
    }

    public double currentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
        return currentBalance;
    }
    public void calculateBalance(){
        for(Transaction transaction :transactions){
            if(transaction.getType()=='d'){
                currentBalance-=transaction.getAmount();
                totalMonthleywithdrawels+=transaction.getAmount();
            }else
            {
             currentBalance+=transaction.getAmount();
             totalMonthleyDeposits+=transaction.getAmount();
            }
        }
        
    }
}
