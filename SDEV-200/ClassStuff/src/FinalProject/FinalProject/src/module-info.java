module FinalProject {
	requires javafx.controls;
	requires junit;
	requires org.junit.jupiter.api;
	
	opens application to javafx.graphics, javafx.fxml;
}
