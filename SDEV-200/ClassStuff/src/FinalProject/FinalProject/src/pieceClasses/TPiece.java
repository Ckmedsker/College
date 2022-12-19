package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class TPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.HOTPINK;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {4, 1}, {6, 1}};
		return startingPiecePosition;
	}
}
