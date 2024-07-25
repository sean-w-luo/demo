package week3;

public class Employee {
	public Employee(String empName, double empSalary){  
		name = empName;
		salary = empSalary;   
	   }	
	   private String name;
	   private double salary;
	   private Employee boss;

	   public void raiseSalary(double amount) {
	         salary = salary + amount;
	   }

	   public void setBoss(Employee empBoss) {
	         boss = empBoss;
	   }
	   public double getSalary() {
		      return salary;
		   }

	   public String getName() {
		      return name;
		   }

	    public Employee getBoss()   {
		      return boss;
		   }

}
