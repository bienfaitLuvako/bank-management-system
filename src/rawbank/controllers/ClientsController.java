package rawbank.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.myBank.Model.DAO.ClientDAO;
import com.myBank.Model.DAO.CompteDAO;
import com.myBank.Model.Entities.Client;
import com.myBank.Model.Entities.Personne;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import rawbank.utils.ContentLoader;

public class ClientsController implements Initializable {
	
	static ClientDAO cl = new ClientDAO();
	static CompteDAO cmptDAO = new CompteDAO();
 	static ArrayList<Personne> clients = (ArrayList<Personne>) cl.findAll();
 	static Client currentClient;
 	
	@FXML
	private Pane root;

	@FXML
	private VBox clientsList;
	@FXML
	private JFXButton AddClientBtn;
	@FXML
	private JFXButton refreshBtn;
	@FXML
	private Pane actionPanel;
	@FXML 
	Label ClientIdentifiers;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		for(int i=0;i<clients.size();i++) {
			
			PersonCardController.fname=clients.get(i).getFirstname()+" "+clients.get(i).getLastname();
			PersonCardController.idNat=clients.get(i).getIdNat();
			clientsList.getChildren().add((new ContentLoader().getContent("PersonCard")));
		}
	}
	
	@FXML
	public void refreshClientsList(ActionEvent event) {
		
	}
	
	@FXML
	public void addClient(ActionEvent event) {
		actionPanel.getChildren().setAll(new ContentLoader().getContent("ClientRegister"));
	}

}
