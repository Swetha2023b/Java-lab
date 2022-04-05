class StudentNew{
	int studentId;
	String studentName;
	int m1,m2,m3;
	StudentNew(int i, String n, int mark1, int mark2, int mark3){
		studentId = i;
		studentName = n;
		m1 = mark1;
		m2 = mark2;
		m3 = mark3;
	}
}
public class ConstructParameterized{
	public static void main(String args[]){
		StudentNew obj1 = new StudentNew(46,"Swetha Prakash",41,42,43);
		StudentNew obj2 = new StudentNew(47,"Susan Sebastian",45,46,47);
		StudentNew obj3 = new StudentNew(46,"Upas Nath",43,48,40);
		System.out.println("\n\nSTUDENT MARK DETAILS\n");
		System.out.println("1.Student Id = " + obj1.studentId);
		System.out.println("  Student Name = " + obj1.studentName);
		System.out.println("  English = " + obj1.m1);
		System.out.println("  Maths = " + obj1.m2);
		System.out.println("  Science = " + obj1.m3);

		System.out.println("\n2.Student Id = " + obj2.studentId);
		System.out.println("  Student Name = " + obj2.studentName);
		System.out.println("  English = " + obj2.m1);
		System.out.println("  Maths = " + obj2.m2);
		System.out.println("  Science = " + obj2.m3);

		System.out.println("\n3.Student Id = " + obj3.studentId);
		System.out.println("  Student Name = " + obj3.studentName);
		System.out.println("  English = " + obj3.m1);
		System.out.println("  Maths = " + obj3.m2);
		System.out.println("  Science = " + obj3.m3);
	}
}