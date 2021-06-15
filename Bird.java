package week2Labwork;

public class Bird {
	int age;
	String name;
	Bird(){
		System.out.println("this is the parrot");
	}
	Bird(String x)
	{
		name=x;
		System.out.println("this is the"+name);
	}
	Bird(int y, String z)
	{
		age=y;
		name=z;
		System.out.println("this is the"+ name+" the age is" +age);
	}
	public static void main(String[] args) {
		Bird obj1=new Bird();
		Bird obj2=new Bird(" maina");
		Bird obj3=new Bird( 20," sparrow");
		
	}

}
