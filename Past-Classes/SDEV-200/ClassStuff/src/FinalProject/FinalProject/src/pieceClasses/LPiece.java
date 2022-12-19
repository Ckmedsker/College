package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class LPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.LIGHTGREEN;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {5, 2}, {6, 2}};
		return startingPiecePosition;
	}
}
