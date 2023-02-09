package week1.day2;

import java.util.Scanner;

public class Check_Positive_Negative {


	public static void main(String[] args) {
		
        Scanner i = new Scanner(System.in);
        
        int input = i.nextInt();

		if(input>0)
		{System.out.println("the number is positive ");
		}
		else if(input<0)
		{System.out.println("the number is negative");
		}
		else {System.out.println("the number is neither negative or positive");
		}
		i.close();
	}
}
