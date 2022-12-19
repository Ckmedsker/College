package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class SquarePiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.PURPLE;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {6, 0}, {6, 1}};
		return startingPiecePosition;
	}
}
