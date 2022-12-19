package application;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class PlayGameController {

	@FXML public AnchorPane mainAnchorPane;
	@FXML public Label selectedModeLabel;
	@FXML public GridPane grid;
	double time;
	double speed;
	int moveDownIndex = 0;
	int pieceIndex = 0;
	static int pieceCode = 7;
	public static Rectangle[] piece = Piece.getPiece(pieceCode);
	int[][] piecePosition = Piece.getStartingPiecePosition(pieceCode);
	// filled with filler data to be replaced
	int[][] filledPositions = {{-1, -1}};
	
	private Stage stage;
	private Scene scene;
	private Parent root;


	// modify for the end of the game
	public void handleTestButton(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);

		stage.setScene(scene);
		stage.show();
	}

	public void getMode(String mode) {
		selectedModeLabel.setText(mode);
	}

	public void dropDown() {
//		
	}

	public void moveLeft() {
		pieceIndex = 0;
		if (!(piecePosition[3][0] == 0)) {
			for (Rectangle tile : piece) {
				int pieceX = piecePosition[pieceIndex][0];
				int pieceY = piecePosition[pieceIndex][1];
				grid.add(new StackPane(tile), pieceX - 1, pieceY);
				piecePosition[pieceIndex][0] = pieceX - 1;
				piecePosition[pieceIndex][1] = pieceY;
				pieceIndex++;
			}
		}
	}

	public void moveRight() {
		pieceIndex = 0;
		if (!(piecePosition[3][0] == 9)) {
			for (Rectangle tile : piece) {
				int pieceX = piecePosition[pieceIndex][0];
				int pieceY = piecePosition[pieceIndex][1];
				grid.add(new StackPane(tile), pieceX + 1, pieceY);
				piecePosition[pieceIndex][0] = pieceX + 1;
				piecePosition[pieceIndex][1] = pieceY;
				pieceIndex++;
			}
		}
	}


	@FXML public Parent initialize() {

		pieceIndex = 0;
		int pieceX = piecePosition[pieceIndex][0];
		int pieceY = piecePosition[pieceIndex][1];
		for (Rectangle tile : piece) {
			grid.add(new StackPane(tile), pieceX, pieceY + moveDownIndex + pieceIndex);
			piecePosition[pieceIndex][0] = pieceX;
			piecePosition[pieceIndex][1] = pieceY;
			pieceIndex++;
		}
		AnimationTimer timer = new AnimationTimer() {

			private long lastToggle;

			@Override
			public void handle(long now) {
				if(lastToggle == 0L) {
					lastToggle = now;
				} else {
					long diff = now - lastToggle;
					// edit the first number in 500_000_000L to make more or less frequent
					if (diff >= 100_000_000L) {
					pieceIndex = 0;
					// stops the given piece at the very bottom
					if (!(piecePosition[3][1] == 20)) {
						int pieceX = piecePosition[pieceIndex][0];
						int pieceY = piecePosition[pieceIndex][1];
						int newPieceY =  pieceY + moveDownIndex;
						// cycling through every tile in the piece (for the straight piece)
						for (Rectangle tile : piece) {
							piecePosition[pieceIndex][0] = pieceX;
							piecePosition[pieceIndex][1] = newPieceY + (pieceIndex - moveDownIndex) + 1;
							grid.add(new StackPane(tile), pieceX, newPieceY + pieceIndex - moveDownIndex);
							pieceIndex++;
						}
						moveDownIndex++;
					} else {
						int pieceX = piecePosition[pieceIndex][0];
						int pieceY = piecePosition[pieceIndex][1];
						for (Rectangle tile : piece) {
							int length = filledPositions.length;
							filledPositions[length - 1][0] = pieceX;
							filledPositions[length - 1][1] = pieceY + pieceIndex;
							pieceIndex++;
						}
					}
					lastToggle = now;
					}
				}
			}
		};
		timer.start();

		return root;
	}
}