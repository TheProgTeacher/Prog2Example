package basics;

import java.util.Scanner;

public class IfAndSwitch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = new String();
		boolean b = false;
		int x = 0;
		
		System.out.println("If example!");
		System.out.print("Write somthing: ");
		str = scan.nextLine();
		b = str.equals("Hello");
		if(b) {
			System.out.println("Hi!");
		}
		else if(str.equals("Bye")) {
			System.out.println("Bye!");
		}
		else {
			System.out.println("...");
		}
		
		System.out.println("Switch example!");
		System.out.println("[1]: Wow!");
		System.out.println("[2]: Cool!");
		System.out.println("[3]: Super!");
		System.out.println("[*]: Rad!");
		System.out.print("Enter a number: ");
		str = scan.nextLine();
		x = Integer.parseInt(str);
		switch(x) {
			case 1:
				System.out.println("Wow!");
				break;
			case 2:
				System.out.println("Cool!");
				break;
			case 3:
				System.out.println("Super!");
				break;
			default:
				System.out.println("Rad!");
		}
		
		scan.close();
	}
}
