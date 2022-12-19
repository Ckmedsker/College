package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class SPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.SEAGREEN;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {6, 1}, {6, 2}};
		return startingPiecePosition;
	}
}
