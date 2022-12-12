package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class PlayGameController {

	@FXML private AnchorPane mainAnchorPane;
	@FXML public Label selectedModeLabel;
	
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
}
