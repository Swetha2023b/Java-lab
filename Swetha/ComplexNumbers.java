import java.util.*;

class ComplexNumbers{
	
	int real, imaginary;
	
	ComplexNumbers(){  }
	
	ComplexNumbers(int real, int imaginary){
		this.real= real;
		this.imaginary= imaginary;
	}
	
	void complexAdd(ComplexNumbers compNum){
		int realSum, imaginarySum;
		realSum= this.real+compNum.real;
		imaginarySum= this.imaginary+compNum.imaginary;
		System.out.println("The sum of the complex numbers is : "+ realSum +" + "+ imaginarySum + "i");
	}
	
	void display(){
		System.out.println("The entered complex number is : "+ real +" + "+ imaginary +"i\n");
	}
	
	public static void main(String[] args){
		
		int realNumber, imaginaryNumber;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the real value of the first complex number : ");
		realNumber= sc.nextInt();
		System.out.print("Enter the imaginary value of the first complex number : ");
		imaginaryNumber= sc.nextInt();
		ComplexNumbers com1= new ComplexNumbers(realNumber, imaginaryNumber);
		com1.display();
		
		System.out.print("Enter the real value of the second complex number : ");
		realNumber= sc.nextInt();
		System.out.print("Enter the imaginary value of the second complex number : ");
		imaginaryNumber= sc.nextInt();
		ComplexNumbers com2= new ComplexNumbers(realNumber, imaginaryNumber);
		com2.display();
		
		com1.complexAdd(com2);
	}
}