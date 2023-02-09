package week1.day2;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {

		int arr [] = {1,2,3,4,6,7,8};
		Arrays.sort(arr);

		for (int i=0 ; i<arr.length;i++) // iterator from position [0] to end of array

		{if( (i+1)==arr[i]) {}    //checking if the iterator value and the array value in corresponding position is the same

		else {System.out.println("iterative variable " +i + " is not equal to array value [ " + arr[i]+ " ]");
		break;
		}
		}
	}
}