package demo;
import java.util.*;
public class Echo {
	public static void main (String[] args)  {//阅读输入的字符串
	      Scanner reader = new Scanner (System.in);
	      System.out.println("Input a line of text");
	      String message = reader.nextLine();
	      System.out.println("Your input was: " 
					+  message);
	}

}

