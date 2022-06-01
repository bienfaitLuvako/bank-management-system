package rawbank.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import rawbank.utils.Scenes;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/rawbank/vues/Login.fxml"));
		Scenes.primaryStage = primaryStage;
		Scenes.launchScene(root);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
