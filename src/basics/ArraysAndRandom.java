package basics;

import static java.lang.System.out;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndRandom {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String str = new String();
		int[] numbers = new int[10];
		
		out.println("Some random numbers:");
		for(int i = 0; i < 10; i++)
			numbers[i] = rand.nextInt();
		for(int i : numbers)
			out.println(i);
		out.println("Press Enter...");
		str = scan.nextLine();
		
		out.println("Some random numbers between 1 and 10:");
		for(int i = 0; i < 10; i++)
			numbers[i] = rand.nextInt(10) + 1;
		for(int i : numbers)
			out.println(i);
		out.println("Press Enter...");
		str = scan.nextLine();

		out.println("The same numbers sorted:");
		Arrays.sort(numbers);
		for(int i : numbers)
			out.println(i);
		out.println("Press Enter...");
		str = scan.nextLine();
				
		out.println("Some random decimal numbers:");
		double[] decimalNumbers = new double[10];
		for(int i = 0; i < 10; i++)
			decimalNumbers[i] = rand.nextDouble();
		for(double i : decimalNumbers)
			out.println(i);
		out.println("Press Enter...");
		str = scan.nextLine();
		
		out.println("Sin of some numbers:");
		for(int i : numbers)
			out.println("sin(" + i + ") = " + Math.sin(i));
		out.println("Press Enter...");
		str = scan.nextLine();
		
		out.println("Some numbers rounded:");
		for(double i : decimalNumbers)
			out.println("round(" + i*100 + ") = " + Math.round(i*100));
	}
}
