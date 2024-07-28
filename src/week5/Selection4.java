package week5;

import java.security.PublicKey;
import java.util.*;

public class Selection4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car value : ");
		double value = sc.nextDouble();
		System.out.print("Enter exp in months : ");
		int exp = sc.nextInt();
		System.out.print("Enter age of car (years) : ");
		int age = sc.nextInt();
		double insurance = value * 0.01; // 1%
		System.out.println("Insurance = " + insurance);
	}
}

