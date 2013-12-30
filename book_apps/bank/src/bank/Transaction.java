/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author zvibock
 */
public class Transaction {
   private String  type;
   private double  amount;
   private String  source;
   
   public void setType(String transactionType){
       this.type=transactionType;
   }  

   public String getType(){
       return type;
   }
   public void setAmount(double amount){
       this.amount= amount;
   }

  
    public double getAmount() {
        return amount;
    }
    public void setSource(String source){
    this.source=source;
    }
   
    public String getSource() {
        return source;
    }
}
 