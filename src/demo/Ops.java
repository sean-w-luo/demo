package demo;
public class Ops {
	public static void main(String[] args){
	int a = 10,p,q,r,s;
	p = a++; // assign a to p then add 1
	q = ++a; // add one to a then assign to p
	r = --a;
	s = a--;
	System.out.println("p  = " + p);					
	System.out.println("r = " + r);			
	System.out.println("s = " + s);			
	System.out.println("a = " + a);			
	System.out.println("q = " + q);		
    }
}
