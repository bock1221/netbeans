/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author zvibock
 */
public class SavingsAccount extends Account {

    protected Double interestRate;

    public void accountInfo() {
        super.accountInfo();
        setInterestRate(.01);
        System.out.println("your monthley interest rate is: "+interestRate);
     }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void endOfMonth(double currentBalance) {
        double interestEarned = this.currentBalance * interestRate;
        Transaction transaction=new Transaction();
        transaction.setAmount(interestEarned);
        transaction.setType("credit");
        transaction.setSource("interest");
                
    }
}
