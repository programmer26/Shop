package gui.view;

import java.io.IOException;

import gui.MainFX;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainViewController {
	private MainFX mainFx;
	
	
	@FXML
	public void Close(ActionEvent actionEvent) {
		Platform.exit();
	}

	@FXML
	public void AboutGeR(ActionEvent actionEvent) throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainFX.class.getResource("about/MainAbout.fxml"));
		AnchorPane mainAbout = loader.load();

		Stage addMainAbout = new Stage();
		addMainAbout.setTitle("About G&R");
		addMainAbout.initModality(Modality.WINDOW_MODAL);
		addMainAbout.initOwner(this.mainFx.getPrimaryStage());

		Scene scene = new Scene(mainAbout);
		addMainAbout.setScene(scene);
		addMainAbout.showAndWait();
	
	}

	public void setMainApp(MainFX mainFx){
		this.mainFx = mainFx;
	}
}