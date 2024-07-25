package demo;
import java.util.*;
public class TestString {
 public static void main(String args[])//测试字符串的长度 并且根据序号找到对应字符
   {  String s;
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a String : ");
      s = console.nextLine();
      int len = s.length();
      System.out.println("Length of s1 is " + len);
      System.out.print("Specify index of character 0 .. " + (len-1)+ " : ");
      int index = console.nextInt();
      System.out.println("Char at index "+ index+" is "+  s.charAt(index));
   }
}
