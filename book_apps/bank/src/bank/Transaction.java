
package bank;

/**
 *
 * @author zvibock
 */
public class Transaction {
   private char  type;
   private double  amount;
   private String  source;
   
   public void setType(char transactionType){
       this.type=transactionType;
   }  

   public char getType(){
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
 