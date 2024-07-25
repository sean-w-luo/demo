package demo;
import java.util.*;
public class CompareString {//比较字符串的长度
	public static void main(String args[])
    {  
       String s1, s2;
       Scanner console = new Scanner(System.in);
       System.out.print("Enter 1st String : ");
       s1 = console.nextLine();
       System.out.print("Enter 2nd String : ");
       s2 = console.nextLine();

       if ( s1.compareTo(s2) > 0 )
           System.out.println( s1 + " > " + s2);
       if ( s1.compareTo(s2) == 0 )
           System.out.println( s1 + " == " + s2);
       if ( s1.compareTo(s2) < 0 )
           System.out.println( s1 + " < " + s2);
     }
}
