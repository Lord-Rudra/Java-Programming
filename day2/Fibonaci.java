package week1.day2;
import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = input.nextInt();

		int first = 0;
		int second = 1;
		int next;

		System.out.println("The first " + n + " terms of the Fibonacci series are:");

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				next = i;
			} else {
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
		}
	}
}
