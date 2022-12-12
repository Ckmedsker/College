package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class MainMenuController implements Initializable {

	@FXML private Label mainLabel;
	@FXML private Button playButton;
	@FXML private ImageView tetrisImage;
	@FXML private Label modeLabel;
	@FXML private ChoiceBox<String> modeChoice;

	private Stage stage;
	private Scene scene;
	private Parent root;

	private String[] modes = {"Infinite Mode", "150 line mode", "300 line mode"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		modeChoice.getItems().addAll(modes);
	}
	
	// when the play button is clicked it gets the data from the dropdown box and sends it to the next scene
	public void handlePlayButton(ActionEvent event) throws IOException {
		String mode = modeChoice.getValue();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayGame.fxml"));
		root = loader.load();
		PlayGameController playGameController = loader.getController();
		playGameController.getMode(mode);


		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
