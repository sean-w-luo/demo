package week4;

/*Write a program that will read the marks of 3 students using the Scanner class and 
display the following:
(a)  average marks
(b)  maximum marks 
Hint:  x = Math.max(a,b); will cause x to be assigned the maximum of a and b
  y = Math.max (x, c); will cause y to be assigned the maximum of a, b and c
 Find other such methods in Math class using Java docs (ask lab-assistant)
 (c)  minimum marks：Similar to part b) but you need to use a different method
* */
public class ReadMax {	
	   public static void main(String[] args) {
		      int total=3;
		      double a = 30.99;
		      double b = 45.77;
		      double c = 90.77;
		      double x;
		      double y;
		      double z;
		      double q;
		      double avg=(a+b+c)/3;
		      double result1;
		   	  double result2;
		    
		    x= Math.max(a,b); 
		    y=Math.max (a,c);
		    z= Math.min(a,b);
		    q=Math.min (a,c);
		    
		   public static double max(double x,double y) {
		    	if(x>y) {
		    		result1=x;
		    	}else {
		    		result1=y;  	
		    		}		  
		    	return result1;
		    	}	
		    
		    public static double min(double x,double y) {
		    	if(x<y) {
		    		result2=x;
		    	}else {
		    		result2=y;  	
		    		}		  
		    	return result2;
			}	  
		    
	    System.out.println(" average marks is " + avg);
	    System.out.println("maximum mark is " + result1);
	    System.out.println("minimum marks is " + result2);
		}	  
}
