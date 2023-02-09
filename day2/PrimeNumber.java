package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 13;

		for (int i=2 ; i<=13; i++)   //checking if 13 is divisible for all values from 2 to 13
		{
			if(number%i==0) {
				System.out.println(" The number is not a prime number ");
			}
			else {
				System.out.println(" the number is a prime number ");
				break;
			}

		}
	}
}

