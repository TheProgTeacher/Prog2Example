package basics;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = new String();
		boolean b = false;
		
		//Loops
		System.out.println("While loop example!");
		System.out.print("Write something: ");
		str = scan.nextLine();
		b = str.equals("while");
		while(!b) {
			System.out.println("That's wrong.");
			System.out.print("Write something: ");
			str = scan.nextLine();
		}
		System.out.println("Correct!");
		
		System.out.println("Do-while loop example!");
		do {
			System.out.print("Write something: ");
			str = scan.nextLine();
			b = str.equals("do while");
		}while(!b);
		System.out.println("Correct!");
		
		System.out.println("For loop example!");
		for(int i = 0;  i < 10; i++) {
			System.out.println("Number " + i);
		}
		
		scan.close();
	}
}
