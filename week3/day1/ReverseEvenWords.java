package week3.day1;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";

		String [] odd = new String[2];
		String [] even = new String[3];
		String[] array = test.split(" ");
		int j =0;
		int k=0;

		for(int i = 0 ; i<array.length; i++ ) {

			if (i%2 != 0) { 

				odd[j]= array[i] ;
				j++;}

			else {
				 even[k]= array[i] ;
				k++;
			}
				

		}
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
		
		for(int n=even.length-1;n>=0;n--) {
			
			System.out.print(even[n]);
		
		
			
			
		}
	}
{
	
}
}
