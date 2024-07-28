package week5;

import java.util.*;

public class FindAverage {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int mark;
		int sum = 0;
		int num = 0;
		System.out.println("Enter marks (-1) to terminate");
		mark = console.nextInt();

		while (mark != -1) {
			sum += mark;
			num++;
			mark = console.nextInt();
		}
		if (num == 0)
			System.out.println("No students in class");
		else
			System.out.println("Aver = " + (double) sum / num);
	}
}
