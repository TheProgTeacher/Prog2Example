package network;

import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.animation.AnimationTimer;
import javafx.application.Platform;

public class ServerJavaFX extends AnimationTimer{
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private String message = "";
	
	public ServerJavaFX() {
		try {
			server = new ServerSocket(6789, 100);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void startServer() throws IOException {
		connection = server.accept();
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
	}
	
	public void stopServer() {
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
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					output.writeObject(message);
					output.flush();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public void handle(long now) {
//		try {
//			message = (String)input.readObject();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		System.out.println("Hej");
	}
}









