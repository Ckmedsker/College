package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class StraightPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.LIGHTBLUE;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {5, 2}, {5, 3}};
		return startingPiecePosition;
	}
}
