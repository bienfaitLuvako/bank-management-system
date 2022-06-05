package rawbank.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.myBank.Model.DAO.AgentDAO;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import rawbank.utils.ContentLoader;

public class MainController implements Initializable{
	@FXML
	private HBox root;
	@FXML
	private JFXButton home;
	@FXML
	private Pane pageContent;

	// Event Listener on JFXButton[#home].onAction
	@FXML
	public void getHomePage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	@FXML
	public void getServicesPage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	@FXML
	public void getAgencesPage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	@FXML
	public void getAgentsPage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	@FXML
	public void getClientsPage(ActionEvent event) {
		
		pageContent.getChildren().setAll(new ContentLoader().getContent("Clients"));
	}
	
	@FXML
	public void getSttetingsPage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	@FXML
	public void getHistoryPage(ActionEvent event) {
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		pageContent.getChildren().setAll(new ContentLoader().getContent("Home"));
	}
}
