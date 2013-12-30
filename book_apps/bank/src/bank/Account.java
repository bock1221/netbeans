/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;
import java.util.Random;


 

 
    public abstract class Account {
    protected int accountNumber;
    protected String firstName;
    protected String lastName;
    protected String addres;
    protected String phoneNumber;
    protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    protected double currentBalance=0;
    protected double totalMonthleyDeposits;
    protected double totalMonthleywithdrawels;
    
    
    public void  accountInfo(){
        
      System.out.println("welcome "+firstName+" "+lastName+"/n"
              +"Your account number is: "+accountNumber);  
} 
    
    
    public void setAccountNumber(){
      Random r = new Random();
      int numbers = 100000 + (int)(r.nextFloat() * 900000);
      accountNumber=numbers;
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
    public void setAddress(String addres) {
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

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
    
      public void endOfMonth(double currentBalance){ 
    
     }
    public void gettransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }}
        public double currentBalance(double currentBalance){
                this.currentBalance =currentBalance;
                return currentBalance;
    }
}
