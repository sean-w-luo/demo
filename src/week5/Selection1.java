package week5;

import java.util.*;

public class Selection1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.print(num + "is even");
		else
			System.out.print(num + "is odd");
	}
}
