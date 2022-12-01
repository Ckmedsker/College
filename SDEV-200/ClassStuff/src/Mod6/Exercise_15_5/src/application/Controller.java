// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import java.lang.Math;


// import javafx.event.ActionEvent;

// public class Controller {

// 	// getting all of the node locations from the FXML Filesj
// 	@FXML
// 	private Label outputText;
// 	@FXML
// 	private TextField investmentAmountInput;
// 	@FXML
// 	private TextField yearsInput;
// 	@FXML
// 	private TextField annualInterestInput;
// 	@FXML
// 	private Button calculateButton;
	
// 	// variable initialization
// 	double futureValue;
// 	double investmentAmount;
// 	double monthlyInterestRate;
// 	int years;

// 	public void submit(ActionEvent event) {

// 		// try catch statement to catch any miss-input and tell the user
// 		try {
// 			investmentAmount = Double.parseDouble(investmentAmountInput.getText());
// 			years = Integer.parseInt(yearsInput.getText());
// 			// dividing by 1200 to get a more accurate number
// 			monthlyInterestRate = (Double.parseDouble(annualInterestInput.getText()) / 1200);
// 			// following the given equation
// 			futureValue = (investmentAmount + Math.pow(1 + monthlyInterestRate, years * 12));
// 			// formatting the string to the second decimal place with content and a dollar symbol
// 			outputText.setText(String.format("The future value is: $%.2f", futureValue));
// 		}
// 		catch (NumberFormatException e) {
// 			// giving the user feedback for all miss-input cases
// 			outputText.setText("Please fill out all fields with numbers!");
// 		}
// 	}
// }
