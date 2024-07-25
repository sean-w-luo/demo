package week3;

public class Account {
	   private String name;
	   private double balance;
	   private String accID;
         // constructor
	   public Account(String accountID, String accountName, double amount)
	   {  
		   accID = accountID;
		   name = accountName;
		   balance = amount;
	   }
	   //  accessors
	   public double getBalance() { return balance; }
	   public String getID() { return accID; }
	   public String getName() { return name; }
	//  mutators performing common operations withdraw, deposit, transfer
	   public void deposit(double amount) {
		  balance  += amount; //计算总的存款deposit，即：balance=balance+amount
	   }
	   public boolean withdraw(double amount) {
	       boolean result = false;	
	       if (balance >= amount)	{
	          balance = balance - amount;
	          result = true;
	        }
	        return result;
	   }
	   public boolean transfer(Account account, double amount) { 
		      if (balance >= amount) {
		          balance = balance - amount;//这个balance 是属于dad的
		          account.balance = account.balance + amount; //这个balance是属于mom的
		          return true;
		       }
		       else return false;
		   }

}// end of class       

/*JAVA中的public boolean是判断布尔类型变量的意思， 
 它的回答只有TRUE和FALSE，当符合条件，会返回TRUE，
  如果不符合条件，会返回FALSE
  
  *public void方法不返回任何值。
public boolean方法返回一个布尔值。  */
