package week5;
import java.io.*;
import java.util.*;

public class CharTest {
	public static void main (String[] args) {
	     Scanner console = new Scanner(System.in);
	     char answer;
	     int charTotal = 0;
	     System.out.println("This program counts the "
	                    + "number of characters entered.");
	     System.out.println("Input char 'Q' ,'q' to quit:");
	     answer = console.next().charAt(0); 
	     while (answer != 'Q' && answer != 'q')  {
	         charTotal++;
		  System.out.println("Input char 'Q’,'q' to quit:");
	         answer = console.next().charAt(0);
	     }
	     System.out.println("Num. of chars = "+ charTotal);
	  } 

}
