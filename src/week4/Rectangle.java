package week4;

/*Week 3 Lab Exercise  
 *  Write a program that prompts  the user for the two (unequal) sides of a rectangle 
 *  and  then computes and prints the area and perimeter （周长） of the specified rectangle. 
 *  The program should display the output in the format below (in one line) 
 *  using field width of 8 and precision of 2 digits after the decimal  point using printf.
 *  Side1 = dd.dd Side2 = dd.dd Area = ddd.dd Perimeter （周长）= dddd.dd
 *  ---------------- Show your work to the Lab assistant to receive the mark--------------------------*/
 public class Rectangle {
	   public static void main(String[] args) {
		      double a = 30.99;
		      double b = 45.77;
		    System.out.println("Side 1 = " + a );
		    System.out.println("Side 2 = " + b );
		    System.out.println("Area= " + a*b );
		    System.out.println("Perimeter= " + (a+b )*2);
		   }
}

