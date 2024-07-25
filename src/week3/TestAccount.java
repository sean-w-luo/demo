package week3;

public class TestAccount {
	public static void main(String args[]) 
	  {
	     Account mum = new Account("s123","Mercy Brown",1000.0);
	     Account dad = new Account("g234","David Brown",5000.0);
	     dad.withdraw(1000);
	     mum.deposit(1000);
	     dad.transfer(mum,2000);
	     System.out.println("mum bal = "+mum.getBalance());
	     System.out.println("dad bal = "+dad.getBalance());
	  }       

}
