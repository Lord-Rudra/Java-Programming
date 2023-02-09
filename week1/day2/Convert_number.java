package week1.day2;

import java.util.Scanner;

public class Convert_number {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int num = i.nextInt();

		if( num<0) {

			num = num*-1;
			System.out.println("the number is converted " + num);
		}
		else {
			System.out.println("the number is already a positive number  ");
		}
		i.close(); // closes resource leak issue of scanner
	}

}
