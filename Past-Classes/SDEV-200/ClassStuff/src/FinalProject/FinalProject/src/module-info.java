module FinalProject {
	requires javafx.controls;
	requires junit;
	requires org.junit.jupiter.api;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
