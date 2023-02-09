package week1.day2;

import java.util.Arrays;

public class Sort_Arrays {

	public static void main(String[] args) {

		int array []= {1,2,3,4,5};
		Arrays.sort(array);
		for (int i=array.length-1; i>=0 ; i--)
		{
			System.out.println(array[i]);
		}
	}


}
