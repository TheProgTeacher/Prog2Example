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
	private boolean connected = false;
	private Thread connectThread = new Thread(new Runnable() {
		public void run() {
			try {
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				output.flush();
				input = new ObjectInputStream(connection.getInputStream());
				connected = true;
			}
			catch(IOException e) {
				System.out.println("Server could not connect");
			}
		}
	});
	
	public Server() {
		try {
			server = new ServerSocket(6789, 100);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		connectThread.start();
	}
	
	public void stop() {
		try {
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException e) {
			System.out.println("Server could not close connection");
		}
	}
	
	public void sendMessage(String message) {
		if(connected) {
			try {
				output.writeObject(message);
				output.flush();
			}
			catch(IOException e) {
				System.out.println("Server could not send message");
			}
		}
	}
}









