package week3;

public class TestEmployee {
	public static void main(String args[]) 
	   {  // constructing 3 Employee objects
	      Employee bill = new Employee("Bill Gates",100000.0);
	      Employee david = new Employee("David Paul",80000.0);
	      Employee mike = new Employee("Mike Mogan",50000.0);
	      david.setBoss(bill);
	      mike.setBoss(david);
	      mike.raiseSalary(10000);
	      david.raiseSalary(40000);

	      // printing details of mike
	      System.out.print("name = " + mike.getName());
	      System.out.print(" Salary = " + mike.getSalary());
	      Employee boss = mike.getBoss();

	      // if mike has a boss print his details	
	      if (boss != null) 
	         System.out.println("Reports to "+ boss.getName());
	      else System.out.println();
	  }       

}
