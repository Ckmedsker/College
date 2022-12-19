package application;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pieceClasses.JPiece;
import pieceClasses.LPiece;
import pieceClasses.SPiece;
import pieceClasses.SquarePiece;
import pieceClasses.StraightPiece;
import pieceClasses.TPiece;
import pieceClasses.ZPiece;

public class Piece {

	@FXML public static GridPane grid;
	public static Rectangle[] piece = new Rectangle[4];


	public static Rectangle[] getPiece(int pieceType) {
		// tiles (needed for all pieces)
		Color pieceColor = Color.GREEN;
		switch(pieceType) {
			case 1:
				pieceColor = StraightPiece.getPieceColor();
			case 2:
				pieceColor = JPiece.getPieceColor();
			case 3:
				pieceColor = LPiece.getPieceColor();
			case 4:
				pieceColor = SquarePiece.getPieceColor();
			case 5:
				pieceColor = SPiece.getPieceColor();
			case 6:
				pieceColor = TPiece.getPieceColor();
			case 7:
				pieceColor = ZPiece.getPieceColor();
		}
		int pieceIndex = 0;
		for (Rectangle tile : piece) {
			piece[pieceIndex] = new Rectangle(48,29);
			piece[pieceIndex].setFill(pieceColor);
			pieceIndex++;
		}
		return piece;

	}
	public static int[][] getStartingPiecePosition(int pieceType) {
		// vertical straight
		int[][] startingPiecePosition = null;
		switch(pieceType) {
			case 1:
				startingPiecePosition = StraightPiece.getStartingPiecePosition();
			case 2:
				startingPiecePosition = JPiece.getStartingPiecePosition();
			case 3:
				startingPiecePosition = LPiece.getStartingPiecePosition();
			case 4:
				startingPiecePosition = SquarePiece.getStartingPiecePosition();
			case 5:
				startingPiecePosition = SPiece.getStartingPiecePosition();
			case 6:
				startingPiecePosition = TPiece.getStartingPiecePosition();
			case 7:
				startingPiecePosition = ZPiece.getStartingPiecePosition();
		}
				
		return startingPiecePosition;
	}
}
