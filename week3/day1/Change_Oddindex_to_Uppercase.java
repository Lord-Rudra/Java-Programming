package week3.day1;

public class Change_Oddindex_to_Uppercase {
	public static void main(String[] args) {
		
		String test = "changename";
		
		char[] testArray = test.toCharArray();
		
		for (int i = 0 ; i<testArray.length; i++) {
		
			
			if (i%2 != 0){
				
				// using Charecter.touppercase method to change the charector at index i to upper case 
				
				testArray[i] = Character.toUpperCase(testArray[i]);
				
			}			
	}
		
		// saving the changed letters from array to string to print it
		
		String changed = new String(testArray);
		
		System.out.println(changed);

}}