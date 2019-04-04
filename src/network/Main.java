package network;

import java.util.Scanner;
import java.io.EOFException;
import java.io.IOException;

import static java.lang.System.out;
import static java.lang.Integer.parseInt;

public class Main {
	private static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		out.print("Run as:\n[1] Server\n[2] Client\n> ");
		switch(parseInt(in.nextLine())) {
		case 1:
			runServer();
			break;
		case 2:
			runClient();
			break;
		}
	}
	
	private static void runServer() {
		out.println("Running as server");
		Server s = new Server();
		out.println("Waiting for client...");
		while(true) {
			try {
				s.start();
				out.println("Client found!");
				String message = new String();
				do {
					out.print("> ");
					s.sendMessage(in.nextLine());
					message = s.getMessage();
					out.println(message);
				}while(!message.equals("STOP"));
			}
			catch(EOFException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				s.stop();
			}
		}
	}
	
	private static void runClient() {
		out.print("Running as client\nEnter IP-address of server\n> ");
		Client c = new Client(in.nextLine());
		try {
			c.start();
			out.println("Server found!");
			String message = new String();
			do {
				message = c.getMessage();
				out.println(message);
				out.print("> ");
				c.sendMessage(in.nextLine());
			}while(!message.equals("STOP"));
		}
		catch(EOFException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			c.stop();
		}
	}
}






















