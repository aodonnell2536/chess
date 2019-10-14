package util;

public class Board {

	private Piece[][] state;
	
	public Board() {
		
		state = new Piece[8][8];
		setBoard();
		
	}
	
	public Board(Piece[][] state) {
		this.state = state;
	}
	
	private void setBoard() {
		
		// dark pieces
		state[0][0] = new Piece(Piece.d_rook,   8, 1);
		state[1][0] = new Piece(Piece.d_knight, 8, 2);
		state[2][0] = new Piece(Piece.d_bishop, 8, 3);
		state[3][0] = new Piece(Piece.d_queen,  8, 4);
		state[4][0] = new Piece(Piece.d_king,   8, 5);
		state[5][0] = new Piece(Piece.d_bishop, 8, 6);
		state[6][0] = new Piece(Piece.d_knight, 8, 7);
		state[7][0] = new Piece(Piece.d_rook,   8, 8);
		
		// pawns
		for (int i = 0; i < 8; i++) {
			state[i][1] = new Piece(Piece.d_pawn, 7, i + 1);
			state[i][6] = new Piece(Piece.l_pawn, 2, i + 1);
		}
		
		// light pieces
		state[0][7] = new Piece(Piece.l_rook,   1, 1);
		state[1][7] = new Piece(Piece.l_knight, 1, 2);
		state[2][7] = new Piece(Piece.l_bishop, 1, 3);
		state[3][7] = new Piece(Piece.l_queen,  1, 4);
		state[4][7] = new Piece(Piece.l_king,   1, 5);
		state[5][7] = new Piece(Piece.l_bishop, 1, 6);
		state[6][7] = new Piece(Piece.l_knight, 1, 7);
		state[7][7] = new Piece(Piece.l_rook,   1, 8);
		
	}
	
	public Piece[][] getState() { return this.state; }
	
	public void setState(Piece[][] state) { this.state = state; }
	
	

}
