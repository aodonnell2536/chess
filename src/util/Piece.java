package util;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Piece {

	public static final int 
		l_king = 0, l_queen = 1, l_bishop = 2, l_knight = 3, l_rook = 4, l_pawn = 5,
		d_king = 6, d_queen = 7, d_bishop = 8, d_knight = 9, d_rook = 10, d_pawn = 11;
	
	private static final Image spriteImage = new Image("1920px-Chess_Pieces_Sprite.png");
	private static final int spriteImageWidth = 320, 
							 spriteImageHeight = 320;
	private static int spriteWidth = Chess.WIDTH / 8,
						spriteHeight = Chess.HEIGHT / 8;
	
	
	private int rank, file;	// y and x respectively, between 1-8
	private int type;
	private ImageView sprite;
	
	public Piece(int type, int rank, int file)  {
		
		this.type = type;
		this.rank = rank;
		this.file = file;
		
		loadSprite();
		
	}
	
	private void loadSprite() {
		
		sprite = new ImageView();
		sprite.setImage(spriteImage);
		
		int x = (type % 6) * spriteImageWidth, y = (type / 6) * spriteImageHeight;
		Rectangle2D viewPort = new Rectangle2D(x, y, spriteImageWidth, spriteImageHeight);
		sprite.setViewport(viewPort);
		sprite.setFitWidth(spriteWidth);
		sprite.setFitHeight(spriteHeight);
		
		// reusing x and y for piece placement now 
		x = (file - 1) * spriteWidth; 
		y = (8 - rank) * spriteHeight;
		sprite.relocate(x, y);
		
	}
	
	public ImageView getSprite() { return this.sprite; }

}
