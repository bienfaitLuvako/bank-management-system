package rawbank.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class PersonCardController implements Initializable{
	static String fname;
	static String idNat;
	
	@FXML
	private Label fullName;
	@FXML
	private Label natId;

	// Event Listener on JFXButton.onAction
	@FXML
	public void ViewClientDetails(ActionEvent event) {
		

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		fullName.setText(fname);
		natId.setText("National ID : "+idNat);
	}
}
