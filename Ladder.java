package week2Labwork;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a=in.nextInt();
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				for(int k=1; k<=a; k--) {
					System.out.print(k);
				}
			}
		}
	}
}
