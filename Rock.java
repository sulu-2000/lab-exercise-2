package week2Labwork;
import java.util.Random;
import java.util.Scanner;
public class Rock {
	public static void main(String[] args) {
		String personPlay;
		String computerPlay=null;
		int computerInt;
		System.out.println("start");
		Scanner scan=new Scanner(System.in);
		personPlay=scan.nextLine();
		scan.close();
		Random generator=new Random();
		int limit=3;
		int random= generator.nextInt(limit);
		
		switch(random)
		{
		case 0: computerPlay="R";
		break;
		case 1: computerPlay="P";
		break;
		case 2: computerPlay="S";
		break;
		}
		if(personPlay.equals(computerPlay)){
			System.out.println("....same choice.....try again....");
		}
		else if(personPlay.equalsIgnoreCase("R")&&computerPlay.equalsIgnoreCase("s")){
			System.out.println("you won the match");	
		}
		else if(personPlay.equalsIgnoreCase("R")&&computerPlay.equalsIgnoreCase("P")){
			System.out.println("system won the match");	
		}
		else if(personPlay.equalsIgnoreCase("S")&&computerPlay.equalsIgnoreCase("R")){
			System.out.println("system won the match");	
		}
		else if(personPlay.equalsIgnoreCase("S")&&computerPlay.equalsIgnoreCase("P")){
			System.out.println("you won the match");	
		}
		else if(personPlay.equalsIgnoreCase("P")&&computerPlay.equalsIgnoreCase("s")){
			System.out.println("system won the match");	
		}
		else if(personPlay.equalsIgnoreCase("P")&&computerPlay.equalsIgnoreCase("R")){
			System.out.println("you won the match");	
		}
		}

}