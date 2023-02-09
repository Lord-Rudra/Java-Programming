package week1.day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int j = 1;
		for (int i = 1 ; i<=input ; i++ )
		{ j = j*i;
		}
		System.out.println("the factorial of "+ input + " is " + j);
		sc.close(); // closes resource leak
	}

}
