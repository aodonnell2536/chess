package util;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Chess extends Application {

	public static final int 
		WIDTH = 600, HEIGHT = 600;

	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Chess");
		BoardGUI boardGUI = new BoardGUI(WIDTH, HEIGHT);
		Scene primaryScene = new Scene(boardGUI, WIDTH, HEIGHT);
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) { launch(args); }
	
}
