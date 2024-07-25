package demo;

public class StringSub3 {

	   public static void main(String args[])//替换字符串中的字符
	   {
	      String s1 = "ABBBBBBA";
	      String s3 = s1.replaceAll("BB","B");
	      System.out.println(s3);            
	   }

}
