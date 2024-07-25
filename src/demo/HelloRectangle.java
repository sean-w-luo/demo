package demo;
import java.awt.Rectangle;
public class HelloRectangle {
	public static void main(String[] args){
	      Rectangle rect1 = new  Rectangle(20,20,40,40);
	      Rectangle rect2 = rect1;
	      rect1.translate(60,80);  // shifting
	      System.out.println(rect1);
	   }

}
