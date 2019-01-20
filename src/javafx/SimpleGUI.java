/*
 * This example show how you can make a simple app with JavaFX.
 * It also show you how to create a menu with the help of an enum.
 * */
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/*
 * The main class of the application.
 * It has to override the class 'Application' from the JavaFX library.
 * */
public class SimpleGUI extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	static Text txt;
	
	@Override
	//In this method you define how your window is going to look
	public void start(Stage primaryStage) {
		try {
			BorderPane rootPane = new BorderPane();
			Scene scene = new Scene(rootPane, 400, 400);
			
			FlowPane bottomPane = new FlowPane();
			Insets margins = new Insets(10);
			bottomPane.setAlignment(Pos.CENTER);
			rootPane.setBottom(bottomPane);
			
			Menu.setState(Menu.MAIN);
			txt = new Text(Menu.getMenuText());
			txt.setFont(new Font(36));
			rootPane.setCenter(txt);
			
			Button btn1 = new Button("Action 1");
			btn1.setOnAction(new Btn1Action());
			bottomPane.getChildren().add(btn1);
			FlowPane.setMargin(btn1, margins);
			
			Button btn2 = new Button("Action 2");
			btn2.setOnAction(new Btn2Action());
			bottomPane.getChildren().add(btn2);
			FlowPane.setMargin(btn2, margins);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

//The event handler for the first button
class Btn1Action implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		switch(Menu.getState()) {
		case MAIN:
			Menu.setState(Menu.FIRST);
			break;
		case FIRST:
			System.out.println("FIZZ");
			break;
		case SECOND:
			System.out.println("BUZZ");
			break;
		}
		SimpleGUI.txt.setText(Menu.getMenuText());
	}
}

//The event handler for the second button
class Btn2Action implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		switch(Menu.getState()) {
		case MAIN:
			Menu.setState(Menu.SECOND);
			break;
		case FIRST:
		case SECOND:
			Menu.setState(Menu.MAIN);
			break;
		}
		SimpleGUI.txt.setText(Menu.getMenuText());
	}
}

//Enum for defining and selecting different menues
enum Menu {
	MAIN, FIRST, SECOND;
	
	private static Menu state;
	
	public static void setState(Menu m) {
		state = m;
	}
	
	public static Menu getState() {
		return state;
	}
	
	public static String getMenuText() {
		switch(state) {
		case MAIN:
			return "[1] First menu\n[2] Second menu";
		case FIRST:
			return "[1] Print FIZZ\n[2] Back";
		case SECOND:
			return "[1] Print BUZZ\n[2] Back";
		default:
			return "error";
		}
	}
}

