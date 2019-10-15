package util;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Chess extends Application {

	public static final int 
		BOARD_WIDTH  = 600,  BOARD_HEIGHT  = 600,
		WINDOW_WIDTH = 1080, WINDOW_HEIGHT = 720;

	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Chess");
		
		BorderPane root = new BorderPane();
		root.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Used to position the boardGUI where it is desired
		Pane left = new Pane();
		Pane right = new Pane();
		Pane top = new Pane();
		left.setPrefWidth(120);
		right.setPrefWidth(360);
		top.setPrefHeight(40);
		root.setLeft(left);
		root.setRight(right);
		root.setTop(top);
		
		BoardGUI boardGUI = new BoardGUI(BOARD_WIDTH, BOARD_HEIGHT);
		BorderPane.setAlignment(boardGUI, Pos.CENTER);
		root.setCenter(boardGUI);
		
		Scene primaryScene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) { launch(args); }
	
}
