package util;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BoardGUI extends Pane {

	String sicilianTest = "rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2";
	
	public int  squareWidth, 
				squareHeight;
	
	private Board board;
	
	public BoardGUI(int width, int height) {
		
		super();
		
		setPrefWidth(width);
		setPrefHeight(height);
		squareWidth = width / 8;
		squareHeight = height / 8;
		
		init();
		
	}
	
	private void init() {
		
		board = FENReader.read(sicilianTest);
		
		drawSquares();
		drawPieces();
		
	}
	
	private void drawSquares() {
		
		Color light = Color.rgb(238,238,210),
			  dark  = Color.rgb(118,150,86);
		
		boolean colorFlag = false;	// Cycles back in forth to form checker-board pattern
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double x = squareWidth * j, y = squareHeight * i;
				Rectangle square = new Rectangle(x, y, squareWidth, squareHeight);
				if (colorFlag)
					square.setFill(light);
				else
					square.setFill(dark);
				
				colorFlag = !colorFlag;
				getChildren().add(square);
			}
			colorFlag = !colorFlag;
		}
		
	}
	
	private void drawPieces() {
		
		Piece[][] boardState = board.getState();
		
		for (int i = 0; i < boardState.length; i++) {
			for (int j = 0; j < boardState[i].length; j++) {
				
				if (boardState[i][j] != null) {
					ImageView sprite = boardState[i][j].getSprite();
					getChildren().add(sprite);
				}
				
			}
		}
		
	}

}
