package application;

import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Controller {

	@FXML TextField fileNameEntry;
	@FXML TextField fileNumberEntry;


	private void handleStartButton() {
			// Get the number of pieces
			int numberOfFiles = Integer.parseInt(fileNumberEntry.getText());

			// Create an array of random access files to hold the pieces
			RandomAccessFile[] splits = new RandomAccessFile[numberOfFiles];

			try (// Create a random access file
				RandomAccessFile inout = 
					new RandomAccessFile(fileNameEntry.getText(), "r");
			) {
				for (int i = 0; i < splits.length; i++) {
					splits[i] = new RandomAccessFile(
						fileNameEntry.getText() + "." + (i + 1), "rw");
				}
				int size = Math.round(inout.length() / numberOfFiles);
				int count = 0; // Counts pieces read
				byte[] b;

				for (int i = 0; i < numberOfFiles - 1; i++) {
					inout.seek(count * size);
					b = new byte[size];
					inout.read(b);
					splits[i].write(b);
					count++;
				}
				inout.seek(count * size);
				b = new byte[(int)inout.length() - (count * size)];
				inout.read(b);
				splits[numberOfFiles - 1].write(b);
			}
			catch (IOException ex) {}
		}
	
	}
}