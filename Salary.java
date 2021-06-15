package week2Labwork;
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary 
{
public static void main(String[] args) 
{
double currentSalary;
double raise = 0;
double newSalary;
String rating;
Scanner scan =new Scanner(System.in);
System.out.println("Enter the current salary:");
currentSalary=scan.nextDouble();
System.out.println("Enter the performance rating(Excellent, Good, or Poor):");
rating=scan.nextLine();
if(rating.equalsIgnoreCase("Excellent"))
{
	raise=currentSalary*0.06;
	newSalary=currentSalary+raise;
	System.out.println("the new salary..."+newSalary);
}
else if(rating.equals("Good"))
{
	raise=currentSalary*0.03;
	newSalary=currentSalary+raise;
	System.out.println("the new salary..."+newSalary);
}
else if(rating.equals("Poor"))
{
	raise=currentSalary*0.01;
	newSalary=currentSalary+raise;
	System.out.println("the new salary..."+newSalary);
}
else {
	System.out.println();
}
newSalary=currentSalary+raise;
NumberFormat money=NumberFormat.getCurrencyInstance();
System.out.println();
System.out.println("Current Salary:"+money.format(currentSalary));
System.out.println("Amount of your raise:"+money.format(raise));
System.out.println("Your new salary:"+money.format(newSalary));
System.out.println();
}

}
