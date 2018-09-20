package inheritance;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class PhoneRegister {
	
	static String menu =
		"[1] Add new phone" + '\n' +
		"[2] List all phones" + '\n' +
		"[3] List all IPhones" + '\n' +
		"[4] Quit";
	static Scanner scan;
	static ArrayList<Phone> phones;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		phones = new ArrayList<>();
		
		boolean running = true;
		while(running) {
			out.print(menu + '\n' + '>');
			String input = scan.nextLine();
			switch(Integer.parseInt(input)) {
				case 1:
					out.print("Input name\n>");
					String name = scan.nextLine();
					out.print("Input os\n>");
					String os = scan.nextLine();
					phones.add(new Phone(name, os));
					break;
				case 2:
					for(Phone p : phones)
						out.println(p);
					break;
				case 3 :
					
					break;
				case 4:
					running = false;
					break;
				default:
					out.println("Not a valid command...");
			}
		}
	}
}
