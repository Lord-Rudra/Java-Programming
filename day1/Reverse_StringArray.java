package week3.day1;

public class Reverse_StringArray {
	public static void main(String[] args) {
		
		String name ="Bala";
		
		char[] name_Array = name.toCharArray();  // changing string to character array [ for each letter ]
		
		for (int i =name_Array.length-1;i>=0;i--) {
			
			System.out.print(name_Array[i]); // prints in reverse ...each character
			
			
			
		}
	}

}
