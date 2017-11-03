package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SampleController {
	@FXML
	private Button cerrar;
	
	
	@FXML
    private void cerrar() {
   	    System.exit(0);
    }

	@FXML
	 public void abrirVentana() {
	        try {
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("Sample2.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("Superheader");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);
	            Image image = new Image("puch.png");  
		        scene.setCursor(new ImageCursor(image));
	            sendStage.initStyle(StageStyle.UNDECORATED);
	            sendStage.show();
	           

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 
	@FXML
	 public void cerrarSegundaVentana() {
		 Stage thisStage = (Stage) cerrar.getScene().getWindow();
		 thisStage.close();
	 }
	
}
