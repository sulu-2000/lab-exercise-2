package week2Labwork;

public class Student {
	String name, city;
	int age;
	static int m;
	void printData() {
		System.out.println("Student name="+name);
		System.out.println("Student city="+city);
		System.out.println("Student age="+age);
	}
}
class stest{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Nikith";
		s1.city="Chennai";
		s1.age=23;
		s2.name="megha";
		s2.city="kerala";
		s2.age=30;
		s1.printData();
		s2.printData();
		s1.m=20;
		s2.m=22;
		Student.m=27;
		System.out.println("s1.m="+s1.m);
		System.out.println("s2.m="+s2.m);
		System.out.println("Student.m="+Student.m);
		
	}
}