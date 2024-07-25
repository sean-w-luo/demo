package demo;
import java.util.*;
public class Exercise3 {//输入一个数字计算平方
	public static void main(String[] args) { 
		//your code here
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a int : ");
	      int x=scanner.nextInt();
	      int Y=x*x;
		  System.out.println("the result is: "+Y);
	}
}
/*Exercise 3:输入一个数字计算平方
Consider the following output:
Starting with x equals 2, and raising
to the power of 2
2 to the power of 2 is 4
4 to the power of 2 is 16
16 to the power of 2 is 256

If x had started at 3, the output would be:
Starting with x equals 3, and raising
to the power of 2
3 to the power of 2 is 9
9 to the power of 2 is 81
81 to the power of 2 is 6561
Design an algorithm (and then a Java program) with a single variable, x, 
that produces the above behaviour*/
