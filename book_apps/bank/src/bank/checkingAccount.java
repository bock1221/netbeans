/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author zvibock
 */

public class checkingAccount extends Account {
    
    protected int overDraftLimit;
    
  
   
        
    
    
    @Override
    public void accountInfo(){
    System.out.println("Checkingaccount");
    super.accountInfo();
    setOverDraftLimit(1000);
    double totalFunds= currentBalance+overDraftLimit;
    String info ="your availible funds including overdraft protection: "+totalFunds; 
    System.out.println(info);
   
    }
    
    public void setOverDraftLimit(int ODLimit){
     overDraftLimit= ODLimit;      
    }
    
    @Override
    public void endOfMonth(){
         Transaction transaction =new Transaction();
        if(currentBalance>1000){
            }
           transaction.setType('d');
           transaction.setAmount(10);
           transaction.setSource("Bank fee");
           transactions.add(transaction);
     }
   
    
     }