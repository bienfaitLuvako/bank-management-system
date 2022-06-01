package rawbank.utils;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class ContentLoader {
	
	private Pane view;
	
	public Pane getContent(String fileName) {
		
		try {
			URL fileURL = rawbank.app.Main.class.getResource("/rawbank/vues/"+fileName+".fxml");
			if(fileURL == null) {
				throw new java.io.FileNotFoundException("FXML file not found");
			}
			
			new FXMLLoader();
			view = FXMLLoader.load(fileURL);
			
		}catch(Exception e) {
			System.out.println("No page, check fxml file loader");
		}
		
		return view;
	}

}
