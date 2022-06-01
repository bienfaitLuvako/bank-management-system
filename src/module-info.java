module test {
	exports rawbank.app to javafx.graphics;
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires com.jfoenix;
	requires java.sql;
	
	opens rawbank.controllers to javafx.fxml;
}