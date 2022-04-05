class StudentNew{
	int studentId;
	String studentName;
	int m1,m2,m3;
	StudentNew(){
		studentId=2396245;
		studentName="Swetha Prakash";
		m1=31;
		m2=33;
		m3=32;
	}
}
public class ConstructDefault{
	public static void main(String args[]){
		StudentNew obj1 = new StudentNew();
		System.out.println("\n\nSTUDENT MARK DETAILS\n");
		System.out.println("Student Id = " + obj1.studentId);
		System.out.println("Student Name = " + obj1.studentName);
		System.out.println("Chemistry = " + obj1.m1);
		System.out.println("Physics = " + obj1.m2);
		System.out.println("Biology = " + obj1.m3);
	}
}