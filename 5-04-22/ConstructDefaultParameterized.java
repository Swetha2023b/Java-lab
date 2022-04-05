class Students{
	int studentId;
	String studentName;
	int m1,m2,m3;
	Students(){
		studentId = 12345117;
		studentName = "Swetha Prakash";
	}
	Students(int mark1, int mark2, int mark3){
		m1 = mark1;
		m2 = mark2;
		m3 = mark3;
	}
}
public class ConstructDefaultParameterized{
	public static void main(String args[]){
		Students obj1 = new Students();
		Students obj2 = new Students(41,42,43);
		System.out.println("\n\nSTUDENT MARK DETAILS\n");
		System.out.println("Student Id = " + obj1.studentId);
		System.out.println("Student Name = " + obj1.studentName);
		System.out.println("English = " + obj2.m1);
		System.out.println("Maths = " + obj2.m2);
		System.out.println("Science = " + obj2.m3);
	}
}