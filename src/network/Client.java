package network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.net.Socket;

import javafx.scene.control.Label;

import java.net.InetAddress;

public class Client {
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket connection;
	private String serverIP = "123.123.123.123";
	private Label label;
	public boolean connected = false;
	private Thread connectThread = new Thread(new Runnable() {
		public void run() {
			try {
				connection = new Socket(InetAddress.getByName(serverIP), 6789);
				output = new ObjectOutputStream(connection.getOutputStream());
				output.flush();
				input = new ObjectInputStream(connection.getInputStream());
				connected = true;
				messageThread.start();
			}
			catch(IOException e) {
				System.out.println("Client could not connect");
			}
		}
	});
	private Thread messageThread = new Thread(new Runnable() {
		public void run() {
			while(connected) {
				try {
					label.setText((String)input.readObject());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	});
	
	public void start(Label l) {
		label = l;
		connectThread.start();
	}
	
	public void stop() {
		try {
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException e) {
			System.out.println("Client could not close connection");
		}
	}
}
