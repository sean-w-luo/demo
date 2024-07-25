package demo;

public class TestVar2 {
	public static void main (String[] args) 
	   {
			int amount = 365;
			amount = amount % 200;
			System.out.println("amount is now " + amount); 
			amount = amount % 100;
			System.out.println("amount is now " + amount); 
			amount = amount % 50;	
			System.out.println("amount is now " + amount); 
	   }
}
