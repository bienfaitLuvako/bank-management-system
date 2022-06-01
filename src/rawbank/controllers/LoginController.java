package rawbank.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import rawbank.utils.Scenes;

public class LoginController implements Initializable{
	
	
	@FXML
	private VBox root;
	
	@FXML
	public void loginBtnClicked(ActionEvent event) {
		
		
		
		
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/rawbank/vues/Main.fxml"));
			Scenes.launchScene(root);
		} catch (IOException e) {
			System.out.println("FXML file not found");
		}
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
