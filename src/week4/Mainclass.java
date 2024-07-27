package week4;

public class Mainclass {
	   public static void main(String[] args) {
		      MyClass t = new MyClass(0);
		      t.info();
		      t.info("overloaded method");
		      //Overloaded constructor:
		      new MyClass();
	   }
}
