package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		 
		 System.out.println(id);
		 
		}
	
	public void getStudentInfo (int id , String name) {
		
		
		System.out.println(id);
		System.out.println(name);
	}
	
	
	public void getStudentInfo (String email, int phone)
	{
		
		System.out.println(phone);
		System.out.println(email);
	}
	public static void main(String[] args) {
		
		
		Students stu = new Students();
		
		stu.getStudentInfo(12, "baaala");
		stu.getStudentInfo("bala@gmail.com", 21);
		stu.getStudentInfo(78);
		

	}

}
