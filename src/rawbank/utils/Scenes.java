package rawbank.utils;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scenes {

	public static Stage primaryStage;
	public static void launchScene(Parent p) {
		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}
}
