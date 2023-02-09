package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num = 34343;
		int reverse = 0;
		int originalNum = num;

		while (num != 0) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num /= 10;
		}

		if (originalNum == reverse) {
			System.out.println(originalNum + " is a palindrome.");
		} else {
			System.out.println(originalNum + " is not a palindrome.");
		}
	}
}
