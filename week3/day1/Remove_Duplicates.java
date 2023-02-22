package week3.day1;

public class Remove_Duplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count = 0 ;
		
		String [] array = text.split(" ");
		
		for (String check : array ) {
			
			if(check.equals("java") || count >3) {
				count++; 
				
				text =text.replace(check, "");
				
			}
		}
		System.out.println(count);
		System.out.println(text);
	}
}
