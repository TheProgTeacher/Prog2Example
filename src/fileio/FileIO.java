package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class FileIO {
	public static void main(String[] args) {
		writefile("Hello world\nasdasdasd", "text2.txt");
		out.print(readfile("text2.txt"));
	}
	
	public static String readfile(String file) {
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(file));
			Scanner scan = new Scanner(reader);
			String output = new String();
			while(scan.hasNextLine())
				output += scan.nextLine() + '\n';
			scan.close();
			reader.close();
			return output;
		}
		catch(IOException exc) {
			out.println(exc);
		}
		return null;
	}
	
	public static void writefile(String text, String file) {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter(file));
			Scanner scan = new Scanner(text);
			while(scan.hasNextLine())
				writer.write(scan.nextLine() + '\n');
			scan.close();
			writer.close();
		}
		catch(IOException exc) {
			out.println(exc);
		}
	}
}
