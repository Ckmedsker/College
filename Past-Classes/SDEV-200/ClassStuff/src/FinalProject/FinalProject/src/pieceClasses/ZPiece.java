package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class ZPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.YELLOW;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {4, 1}, {4, 2}};
		return startingPiecePosition;
	}
}
