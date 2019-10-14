package util;

import java.util.HashMap;
import java.util.Map;

public class FENReader {

	private static Map<Character, Integer> map;
	
	static {
		
		map = new HashMap<>();
		
		map.put('r', Piece.d_rook);
		map.put('b', Piece.d_bishop);
		map.put('n', Piece.d_knight);
		map.put('q', Piece.d_queen);
		map.put('k', Piece.d_king);
		map.put('p', Piece.d_pawn);
		
		map.put('R', Piece.l_rook);
		map.put('B', Piece.l_bishop);
		map.put('N', Piece.l_knight);
		map.put('Q', Piece.l_queen);
		map.put('K', Piece.l_king);
		map.put('P', Piece.l_pawn);
		
	}
	
	// TODO Create Exception subclass for invalid String not being in FEN Notation
	
	/**
	 * Returns the current state of the board, assuming that the given <code>String</code>
	 * is already in proper FEN notation
	 * that the <code>String</code> is given in proper FEN notation
	 * @param state <code>String</code> denoting the board in FEN notation
	 * @return <code>Piece[][]</code> storing the state of the board
	 * @throws Exception
	 */
	public static Board read(String record) {
		
		String[] info = record.split(" ");
		
		// Setting the board
		Piece[][] state = new Piece[8][8];
		int rank = 8, file = 1;
		for (int i = 0; i < info[0].length(); i++) {
			
			char c = info[0].charAt(i);
			
			if (isValidPiece(c)) {
				int pieceType = map.get(c);
				state[file - 1][rank - 1] = new Piece(pieceType, rank, file);
				file += 1;
			} 
			else if (isValidDigit(c)) {
				int emptySpaceCount = Integer.parseInt(""+c);
				file += emptySpaceCount;
			}
			else if (c == '/') {
				rank -= 1; 
				file = 1;
			}
			
		}
		
		return new Board(state);
		
	}
	
	private static boolean isValidPiece(char c) {
		return c == 'r' || c == 'b' || c == 'n' || c == 'k' || c == 'q' || c == 'p' || 
				c == 'R' || c == 'B' || c == 'N' || c == 'K' || c == 'Q' || c == 'P';
	}
	
	private static boolean isValidDigit(char c) {
		
		int i;
		try {
			i = Integer.parseInt(""+c);
		} catch (NumberFormatException e) {
			return false;
		}
		if (i < 1 || i > 8) 
			return false;
		return true;
		
	}

}
