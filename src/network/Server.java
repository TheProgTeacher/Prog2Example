package network;

import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public Server() {
		try {
			server = new ServerSocket(6789, 100);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() throws IOException {
		connection = server.accept();
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
	}
	
	public void stop() {
		try {
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String message) {
		try {
			output.writeObject(message);
			output.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getMessage() {
		try {
			PushbackInputStream buf = new PushbackInputStream(input);
			int b = buf.read();
			if(b != -1) {
				buf.unread(b);
				
				return (String)input.readObject();
			}
			else
				return "";
		}
		catch(IOException e) {
			e.printStackTrace();
			return "";
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			return "";
		}
	}
}









