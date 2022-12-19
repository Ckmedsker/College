package pieceClasses;

import application.Piece;
import javafx.scene.paint.Color;

public class JPiece extends Piece{

	public static Color getPieceColor() {
		// color
		Color pieceColor = Color.RED;
		return pieceColor;
	}

	public static int[][] getStartingPiecePosition() {

		int[][] startingPiecePosition = {{5, 0}, {5, 1}, {5, 2}, {4, 2}};
		return startingPiecePosition;
	}
}
