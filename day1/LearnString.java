package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		// literAL
	   String s = "Test"; // stored in string pool
	   
	   String n = "Test"; // points to the same memory/address in string pool as variable s
	  
	   // Using instance
	   
	   String s1=new String ("Test"); // Object is placed in heap memory , even if the value is the same

	   // for comparing the actual content
	   
	   if (n.equals(s1)){
		   System.out.println("same");}
	   else
	   {System.out.println("not same");}
	   
	   // to Ignore upper or lower case for content.. use (.equalsIgnorecase)
	   
	   
	   System.out.println(s);
	}

}
